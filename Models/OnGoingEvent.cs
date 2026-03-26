using System;
using System.Collections.Generic;
using System.Text;

namespace RoomWidget.Models
{
    public class OnGoingEvent
    {
        public string CalendarName { get; set; }
        public string Title { get; set; }
        public DateTime Start {  get; set; }
        public DateTime End { get; set; }
        public string Location { get; set; }
        public string Guests { get; set; }
    }
}
