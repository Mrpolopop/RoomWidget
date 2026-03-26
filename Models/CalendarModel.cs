using Ical.Net;
using System;
using System.Collections.Generic;
using System.Text;

namespace RoomWidget.Models
{
    class CalendarModel
    {
        public string url;
        public string name;

        public CalendarModel(string name, string url)
        {
            this.url = url;
            this.name = name;
        }

        public async Task<OnGoingEvent?> GetOnGoingEvent()
        {
            var downloadedCalendar = await CalendarModel.GetCalendarFromHttp(this.url);
            OnGoingEvent? currentEvent = null;

            foreach (var vEvent in downloadedCalendar.Events)
            {
                var time = DateTime.Now;
                var start = vEvent.Start!.AsUtc.ToLocalTime();
                var end = vEvent.End!.AsUtc.ToLocalTime();

                if (start <= time && end > time)
                {
                    currentEvent = new OnGoingEvent
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

        public async Task<OnGoingEvent> GetNextEvent()
        {
            var downloadedCalendar = await CalendarModel.GetCalendarFromHttp(this.url);
            OnGoingEvent? currentEvent = null;

            foreach (var vEvent in downloadedCalendar.Events)
            {
                var time = DateTime.Now;
                var start = vEvent.Start!.AsUtc.ToLocalTime();
                var end = vEvent.End!.AsUtc.ToLocalTime();

                if (start >= time.AddMinutes(-15) && start < time.AddHours(12))
                {
                    currentEvent = new OnGoingEvent
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

        public static async Task<Calendar> GetCalendarFromHttp(string url)
        {
            using (HttpClient client = new HttpClient())
            {
                string content = await client.GetStringAsync(url);

                return Calendar.Load(content);
            }
        }
    }
}
