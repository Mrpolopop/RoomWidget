using Android.App;
using Android.Appwidget;
using Android.Content;
using Android.Widget;
using AndroidX.Work;
using RoomWidget.Models;
using RemoteViews = Android.Widget.RemoteViews;

namespace RoomWidget.Platforms.Android
{

    // 1. Déclare que c'est un BroadcastReceiver
    [BroadcastReceiver(Label = "Mon Widget MAUI", Exported = true)]
    // 2. Filtre pour écouter les demandes de mise à jour de widget
    [IntentFilter(new string[] { "android.appwidget.action.APPWIDGET_UPDATE" })]
    // 3. Lie le fichier de métadonnées xml créé à l'étape B
    [MetaData("android.appwidget.provider", Resource = "@xml/widget_info")]

    public class MyWidget : AppWidgetProvider
    {
        public override void OnUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds)
        {
            // Cette méthode est appelée à chaque "updatePeriodMillis" ou lors de l'ajout du widget
            // On crée une requête de travail immédiate
            var workRequest = new OneTimeWorkRequest.Builder(Java.Lang.Class.FromType(typeof(CalendarWorker))).Build();

            // On l'envoie au système
            WorkManager.GetInstance(context).Enqueue(workRequest);
        }

        private async void UpdateWidget(Context context, AppWidgetManager appWidgetManager, int widgetId)
        {
            // 1. Préparer le Layout via RemoteViews
            // Note : On utilise le nom du package de l'application
            var views = new RemoteViews(context.PackageName, Resource.Layout.widget_layout);
            views.SetTextViewText(Resource.Id.calendarName, "chargement ...");

            appWidgetManager.UpdateAppWidget(widgetId, views);

            CalendarModel calendar = new CalendarModel("i2g4", "https://edt-v2.univ-nantes.fr/calendar/ics?timetables[0]=106109");
            OnGoingEvent? currentEvent = null;

            // 2. Modifier le texte (Exemple : mettre l'heure actuelle)
            views.SetTextViewText(Resource.Id.calendarName, calendar.name);

            var pendingResult = GoAsync();

            try
            {
                currentEvent = await calendar.GetOnGoingEvent();

                views.SetTextViewText(Resource.Id.currentRoom, currentEvent != null ? currentEvent.Location : "Champ libre !");
                views.SetTextViewText(Resource.Id.debug,"update : " + DateTime.Now.ToString("HH:mm"));
                appWidgetManager.UpdateAppWidget(widgetId, views);

            } 
            catch (Exception e) 
            {
                views.SetTextViewText(Resource.Id.debug, e.Message + " \n" +DateTime.Now.ToString("HH:mm"));
                appWidgetManager.UpdateAppWidget(widgetId, views);
            }
            finally
            {
                pendingResult.Finish();
            }

            // 4. Appliquer les changements
            appWidgetManager.UpdateAppWidget(widgetId, views);
        }
    }
}
