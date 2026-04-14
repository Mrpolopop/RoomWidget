using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Ical.Net;
using RoomWidget.Models;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Diagnostics;
using System.Text;

namespace RoomWidget.ViewModels
{
    public partial class HomeViewModel : ObservableObject
    {
        private CalendarDAO dao;
        private List<CalendarModel> calendarList;

        [ObservableProperty]
        private ObservableCollection<CalendarEvent> onGoingEvents = new();

        [ObservableProperty]
        private bool isBusy = false;

        [ObservableProperty]
        private string calendarName = string.Empty;

        [ObservableProperty]
        private string calendarUrl = string.Empty;

        [ObservableProperty]
        private bool errorOccured = false;

        [ObservableProperty]
        private string errorMessage = string.Empty;

        public HomeViewModel()
        {
            _ = this.UpdateContent();
        }

        [RelayCommand]
        private async Task UpdateContent()
        {
            using(CalendarDAO dao = new CalendarDAO())
            {
                this.calendarList = dao.getCalendarsList();
            }

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

        [RelayCommand]
        private async Task AddCalendar()
        {
            ErrorOccured = false;
            Debug.WriteLine(CalendarName);
            Debug.WriteLine(CalendarUrl);
            bool exceptionOccured = false;
            try
            {
                await CalendarModel.CheckUrlAsync(CalendarUrl);
            }
            catch (Exception e)
            {
                ErrorOccured = true;
                ErrorMessage = "Url Invalide";
                exceptionOccured = true;
            }

            if (!exceptionOccured)
            {
                CalendarModel calendar = new CalendarModel(CalendarName, CalendarUrl);

                try
                {
                    using(CalendarDAO dao = new CalendarDAO())
                    {
                        dao.AddCalendar(calendar);
                    }
                }
                catch(Exception e)
                {
                    ErrorOccured = true;
                    ErrorMessage = "Calendrier de même nom déjà existant";
                }
            }

            CalendarName = string.Empty;
            CalendarUrl = string.Empty;
            await this.UpdateContent();
        }
    }
}
