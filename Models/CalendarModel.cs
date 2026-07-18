using Ical.Net;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;

namespace RoomWidget.Models
{
    public class CalendarModel
    {
        public string url { get; set; }
        public string name { get; set; }

        public CalendarModel(string name, string url)
        {
            this.url = url;
            this.name = name;
        }

        public async Task<CalendarEvent?> GetOnGoingEvent()
        {
            var downloadedCalendar = await GetCalendarFromHttp(this.url);
            CalendarEvent? currentEvent = null;

            foreach (var vEvent in downloadedCalendar.Events)
            {
                var time = DateTime.Now;
                var start = vEvent.Start!.AsUtc.ToLocalTime();
                var end = vEvent.End!.AsUtc.ToLocalTime();

                if (start <= time && end > time)
                {
                    currentEvent = new CalendarEvent
                    {
                        CalendarName = this.name,
                        Title = vEvent.Summary,
                        Start = start,
                        End = end,
                        Location = vEvent.Location,
                        Guests = vEvent.Description
                    };
                    break;
                }
            }

            return currentEvent;
        }

        public async Task<CalendarEvent> GetNextEvent()
        {
            var downloadedCalendar = await GetCalendarFromHttp(this.url);
            CalendarEvent? currentEvent = null;

            foreach (var vEvent in downloadedCalendar.Events)
            {
                var time = DateTime.Now;
                var start = vEvent.Start!.AsUtc.ToLocalTime();
                var end = vEvent.End!.AsUtc.ToLocalTime();

                if (start >= time.AddMinutes(-15) && start < time.AddHours(12))
                {
                    currentEvent = new CalendarEvent
                    {
                        CalendarName = this.name,
                        Title = vEvent.Summary,
                        Start = start,
                        End = end,
                        Location = vEvent.Location,
                        Guests = vEvent.Description
                    };
                    break;
                }
            }

            return currentEvent;
        }

        private async Task<Calendar> GetCalendarFromHttp(string url)
        {
            using (HttpClient client = new HttpClient())
            {
                string content = await client.GetStringAsync(url);

                return Calendar.Load(content);
            }
        }

        public static async Task CheckUrlAsync(string url)
        {
            using (HttpClient client = new HttpClient())
            {
                string content = await client.GetStringAsync(url);

                if (Calendar.Load(content) == null)
                {
                    throw new Exception("Bad Url");
                }
            }
        }
    }
}
