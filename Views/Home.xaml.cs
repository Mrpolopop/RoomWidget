using System;
using System.Collections.Generic;
using System.Text;
using Microsoft.Maui.Controls;
using RoomWidget.ViewModels;

namespace RoomWidget.Views
{
    public partial class Home  : ContentPage
    {
        public Home(HomeViewModel viewModel)
        {
            InitializeComponent();

            BindingContext = viewModel;
        }
    }
}
