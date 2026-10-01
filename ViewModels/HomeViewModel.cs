using CommunityToolkit.Mvvm.ComponentModel;
using CommunityToolkit.Mvvm.Input;
using Ical.Net;
using RoomWidget.Models;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Diagnostics;
using System.Runtime.CompilerServices;
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

        [ObservableProperty]
        private ObservableCollection<CalendarModel> pickerCalendars = new();

        [ObservableProperty]
        private CalendarModel selectedCalendar;

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

            PickerCalendars.Clear();
            foreach (var calendar in this.calendarList)
            {
                PickerCalendars.Add(calendar);
            }

            CalendarModel dbSelected = null;

            using (CalendarDAO dao = new CalendarDAO())
            {
                dbSelected = dao.getSelectedCalendar();
            }

            if (dbSelected != null)
            {
                SelectedCalendar = PickerCalendars.FirstOrDefault(c => c.name == dbSelected.name);
            }
            else
            {
                SelectedCalendar = null;
            }

            OnGoingEvents.Clear();

            foreach (var calendar in this.calendarList) {
                var currentEvent = await calendar.GetOnGoingEvent();

                if (currentEvent != null) {
                    OnGoingEvents.Add(currentEvent);
                } else
                {
                    OnGoingEvents.Add(new CalendarEvent
                    {
                        CalendarName = calendar.name,
                        Title = "Champ libre !!",
                        Start = DateTime.Now,
                        End = DateTime.Now.AddHours(1),
                        Location = "",
                        Guests = ""
                    });
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

        [RelayCommand]
        public async Task DeleteCalendar(string calendarName)
        {
            try {
                using (CalendarDAO dao = new CalendarDAO())
                {
                    int id = dao.GetCalendarIdByName(calendarName);
                    dao.RemoveCalendar(id);
                }

                await this.UpdateContent();

            } catch(Exception e)
            {

            }
        }

        partial void OnSelectedCalendarChanged(CalendarModel newSelectedCalendar)
        {
            if (newSelectedCalendar == null) return;

            if (IsBusy) return;

            using (CalendarDAO dao = new CalendarDAO())
            {
                int calendarId = dao.GetCalendarIdByName(newSelectedCalendar.name);
                dao.SelectCalendar(calendarId);
            }
        }

        [RelayCommand]
        private async Task GoToSettingsAsync()
        {
            await Shell.Current.GoToAsync("Settings");
        }
    }
}
