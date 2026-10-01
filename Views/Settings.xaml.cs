using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using RoomWidget.ViewModels;

namespace RoomWidget.Views;

public partial class Settings : ContentPage
{
    public Settings(SettingsViewModel viewModel)
    {
        InitializeComponent();
        
        BindingContext = viewModel;
    }
}