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

        public static void ScheduleUpdate(Context context, DateTime triggerTime)
        {
            var intent = new Intent(context, typeof(MyWidget));
            intent.SetAction(AppWidgetManager.ActionAppwidgetUpdate);

            // On récupère les IDs pour forcer OnUpdate
            var ids = AppWidgetManager.GetInstance(context).GetAppWidgetIds(new ComponentName(context, Java.Lang.Class.FromType(typeof(MyWidget))));
            intent.PutExtra(AppWidgetManager.ExtraAppwidgetIds, ids);

            var pendingIntent = PendingIntent.GetBroadcast(context, 0, intent, PendingIntentFlags.UpdateCurrent | PendingIntentFlags.Immutable);
            var alarmManager = (AlarmManager)context.GetSystemService(Context.AlarmService);

            long triggerMs = new DateTimeOffset(triggerTime).ToUnixTimeMilliseconds();

            // SetExactAndAllowWhileIdle est crucial pour que ça marche même si le téléphone "dort"
            alarmManager.SetExactAndAllowWhileIdle(AlarmType.RtcWakeup, triggerMs, pendingIntent);
        }
    }
}
