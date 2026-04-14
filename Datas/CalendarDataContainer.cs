using RoomWidget.Models;
using System;
using System.Collections.Generic;
using System.Text;

namespace RoomWidget.Datas
{
    class CalendarDataContainer
    {
        public int widgetCalendar { get; set; } = -1;
        public List<CalendarModel> calendars { get; set; } = [];
    }
}
