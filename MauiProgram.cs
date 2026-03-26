using Microsoft.Extensions.Logging;
using RoomWidget.ViewModels;
using RoomWidget.Views;

namespace RoomWidget
{
    public static class MauiProgram
    {
        public static MauiApp CreateMauiApp()
        {
            var builder = MauiApp.CreateBuilder();
            builder.UseMauiApp<App>();

            builder.Services.AddTransient<HomeViewModel>();
            builder.Services.AddTransient<Home>();

            return builder.Build();
        }
    }
}
