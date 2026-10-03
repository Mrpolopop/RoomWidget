using Android.App;
using Android.Appwidget;
using Android.Content;
using Android.Widget;
using RoomWidget.Models;
using RemoteViews = Android.Widget.RemoteViews;
using System;
using System.Threading.Tasks;

namespace RoomWidget.Platforms.Android
{
    [BroadcastReceiver(Label = "Mon Widget MAUI", Exported = true)]
    [IntentFilter(new string[] { "android.appwidget.action.APPWIDGET_UPDATE" })]
    [MetaData("android.appwidget.provider", Resource = "@xml/widget_info")]
    public class MyWidget : AppWidgetProvider
    {
        public override void OnUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)
        {
            // GoAsync maintient l'application en vie le temps de la tâche asynchrone
            var pendingResult = GoAsync();

            Task.Run(async () =>
            {
                try
                {
                    await PerformUpdate(context, appWidgetManager, appWidgetIds);
                }
                catch (Exception ex)
                {
                    System.Diagnostics.Debug.WriteLine($"Erreur OnUpdate: {ex.Message}");
                }
                finally
                {
                    pendingResult.Finish();
                }
            });
        }

        private async Task PerformUpdate(Context context, AppWidgetManager manager, int[] appWidgetIds)
        {
            var widget = new ComponentName(context, Java.Lang.Class.FromType(typeof(MyWidget)));
            var views = new RemoteViews(context.PackageName, Resource.Layout.widget_layout);
            
            views.SetTextViewText(Resource.Id.calendarName, "chargement ...");
            views.SetTextViewText(Resource.Id.currentRoom, "Recherche en cours...");
            manager.UpdateAppWidget(widget, views);

            try
            {
                CalendarModel? calendar = null;
                CalendarEvent? currentEvent = null;

                using (CalendarDAO dao = new CalendarDAO())
                {
                    calendar = dao.getSelectedCalendar();
                }

                if (calendar == null)
                {
                    views.SetTextViewText(Resource.Id.calendarName, "Aucun calendrier sélectionné.");
                    views.SetTextViewText(Resource.Id.currentRoom, "");
                    views.SetTextViewText(Resource.Id.debug, "update : " + DateTime.Now.ToString("HH:mm"));
                    manager.UpdateAppWidget(widget, views);
                    
                    ScheduleSafeUpdate(context, DateTime.Now.AddHours(1));
                    return;
                }

                views.SetTextViewText(Resource.Id.calendarName, calendar.name);
                currentEvent = await calendar.GetNextEvent();

                views.SetTextViewText(Resource.Id.currentRoom, currentEvent != null ? currentEvent.Location : "Champ libre !");
                views.SetTextViewText(Resource.Id.debug, "update : " + DateTime.Now.ToString("HH:mm"));
                manager.UpdateAppWidget(widget, views);

                if (currentEvent != null)
                {
                    DateTime nextUpdate = currentEvent.End.AddMinutes(-10);
                    ScheduleSafeUpdate(context, nextUpdate);
                }
                else
                {
                    ScheduleSafeUpdate(context, DateTime.Now.AddHours(4));
                }
            }
            catch (Exception e)
            {
                views.SetTextViewText(Resource.Id.calendarName, "Erreur de synchronisation");
                views.SetTextViewText(Resource.Id.currentRoom, "-");
                views.SetTextViewText(Resource.Id.debug, "Erreur \n" + DateTime.Now.ToString("HH:mm"));
                manager.UpdateAppWidget(widget, views);
                
                ScheduleSafeUpdate(context, DateTime.Now.AddMinutes(15));
            }
        }

        public static void ScheduleSafeUpdate(Context context, DateTime targetTime)
        {
            if (targetTime <= DateTime.Now)
            {
                targetTime = DateTime.Now.AddMinutes(2);
            }

            var intent = new Intent(context, typeof(MyWidget));
            intent.SetAction(AppWidgetManager.ActionAppwidgetUpdate);

            var ids = AppWidgetManager.GetInstance(context).GetAppWidgetIds(new ComponentName(context, Java.Lang.Class.FromType(typeof(MyWidget))));
            intent.PutExtra(AppWidgetManager.ExtraAppwidgetIds, ids);

            var pendingIntent = PendingIntent.GetBroadcast(context, 0, intent, PendingIntentFlags.UpdateCurrent | PendingIntentFlags.Immutable);
            var alarmManager = (AlarmManager)context.GetSystemService(Context.AlarmService);

            long triggerMs = new DateTimeOffset(targetTime).ToUnixTimeMilliseconds();

            alarmManager.SetExactAndAllowWhileIdle(AlarmType.RtcWakeup, triggerMs, pendingIntent);
        }
    }
}