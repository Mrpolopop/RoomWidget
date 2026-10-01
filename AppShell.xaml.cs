using RoomWidget.Views;

namespace RoomWidget
{
    public partial class AppShell : Shell
    {
        public AppShell()
        {
            InitializeComponent();
            
            Routing.RegisterRoute("Settings", typeof(Settings));
        }
    }
}
