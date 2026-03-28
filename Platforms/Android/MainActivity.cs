using Android.App;
using Android.Content;
using Android.Content.PM;
using Android.OS;
using Android.Provider;

namespace RoomWidget
{
    [Activity(Theme = "@style/Maui.SplashTheme", MainLauncher = true, LaunchMode = LaunchMode.SingleTop, ConfigurationChanges = ConfigChanges.ScreenSize | ConfigChanges.Orientation | ConfigChanges.UiMode | ConfigChanges.ScreenLayout | ConfigChanges.SmallestScreenSize | ConfigChanges.Density)]
    public class MainActivity : MauiAppCompatActivity
    {
        protected override void OnCreate(Bundle savedInstanceState)
        {
            base.OnCreate(savedInstanceState);

            // Appel de la vérification au lancement de l'application
            RequestExactAlarmPermission();
        }

        private void RequestExactAlarmPermission()
        {
            // On vérifie si on est sur Android 12 (API 31) ou plus
            if (Build.VERSION.SdkInt >= BuildVersionCodes.S)
            {
                var alarmManager = (AlarmManager)GetSystemService(Context.AlarmService);

                // Si l'application n'a pas encore le droit de programmer des alarmes exactes
                if (alarmManager != null && !alarmManager.CanScheduleExactAlarms())
                {
                    // On prépare l'ouverture de la page de paramètres
                    var intent = new Intent(Settings.ActionRequestScheduleExactAlarm);
                    intent.SetData(Android.Net.Uri.Parse($"package:{PackageName}"));
                    intent.AddFlags(ActivityFlags.NewTask);

                    StartActivity(intent);
                }
            }
        }
    }
}