using Android.Content;
using Android.Widget;
using AndroidX.Work;
using Android.App;
using Android.Appwidget;
using RoomWidget.Models;
using RemoteViews = Android.Widget.RemoteViews;

namespace RoomWidget.Platforms.Android
{
    public class CalendarWorker : Worker
    {
        public CalendarWorker(Context context, WorkerParameters workerParams) : base(context, workerParams)
        {
        }

        public override Result DoWork()
        {
            var task = Task.Run(async () => await UpdateWidget());
            task.Wait();

            return Result.InvokeSuccess();
        }

        private async Task UpdateWidget()
        {
            var context = ApplicationContext;
            var widget = new ComponentName(context, Java.Lang.Class.FromType(typeof(MyWidget)));
            var manager = AppWidgetManager.GetInstance(context);

            // 1. Préparer le Layout via RemoteViews
            // Note : On utilise le nom du package de l'application
            var views = new RemoteViews(context.PackageName, Resource.Layout.widget_layout);

            views.SetTextViewText(Resource.Id.calendarName, "chargement ...");
            manager.UpdateAppWidget(widget, views);

            CalendarModel? calendar = null;
            CalendarEvent? currentEvent = null;

            using (CalendarDAO dao = new CalendarDAO())
            {
                calendar = dao.getSelectedCalendar();
            }

            if (calendar == null)
            {
                views.SetTextViewText(Resource.Id.calendarName, "Aucun calendrier séléctionné.");
                views.SetTextViewText(Resource.Id.currentRoom, "");
                views.SetTextViewText(Resource.Id.debug, "update : " + DateTime.Now.ToString("HH:mm"));
                manager.UpdateAppWidget(widget, views);
                MyWidget.ScheduleUpdate(context, DateTime.Now.AddHours(1));

            }else
            {
                views.SetTextViewText(Resource.Id.calendarName, calendar.name);

                try
                {
                    currentEvent = await calendar.GetNextEvent();

                    views.SetTextViewText(Resource.Id.currentRoom, currentEvent != null ? currentEvent.Location : "Champ libre !");
                    views.SetTextViewText(Resource.Id.debug, "update : " + DateTime.Now.ToString("HH:mm"));
                    manager.UpdateAppWidget(widget, views);
                    if (currentEvent != null)
                    {
                        MyWidget.ScheduleUpdate(context, currentEvent.End.AddMinutes(-10));
                    }
                }
                catch (Exception e)
                {
                    views.SetTextViewText(Resource.Id.debug, e.Message + " \n" + DateTime.Now.ToString("HH:mm"));
                    manager.UpdateAppWidget(widget, views);
                    MyWidget.ScheduleUpdate(context, DateTime.Now.AddHours(1));

                }
            }
        }
    }
}
