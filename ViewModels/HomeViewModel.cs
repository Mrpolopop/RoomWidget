using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Ical.Net;
using RoomWidget.Models;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Text;

namespace RoomWidget.ViewModels
{
    public partial class HomeViewModel : ObservableObject
    {

        private CalendarModel[] calendarList = { 
            new CalendarModel("i2g4", "http://edt-v2.univ-nantes.fr/calendar/ics?timetables[0]=106109"),
            new CalendarModel("i2g1", "http://edt-v2.univ-nantes.fr/calendar/ics?timetables[0]=106116"),
            new CalendarModel("i2g2", "http://edt-v2.univ-nantes.fr/calendar/ics?timetables[0]=106162"),
        };

        [ObservableProperty]
        private ObservableCollection<OnGoingEvent> onGoingEvents = new();

        [ObservableProperty]
        private bool isBusy = false;

        public HomeViewModel()
        {
            _ = this.UpdateContent();
        }

        [RelayCommand]
        private async Task UpdateContent()
        {
            IsBusy = true;

            OnGoingEvents.Clear();

            foreach (var calendar in calendarList) {
                var currentEvent = await calendar.GetOnGoingEvent();

                if (currentEvent != null) {
                    OnGoingEvents.Add(currentEvent);
                }
            }

            IsBusy = false;
        }
    }
}
