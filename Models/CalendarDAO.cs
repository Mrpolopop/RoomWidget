using RoomWidget.Datas;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Text;
using System.Text.Json;

namespace RoomWidget.Models
{
    class CalendarDAO : IDisposable
    {
        private string filePath;
        private CalendarDataContainer data;
        public Boolean saveOnChange;

        public CalendarDAO(string fileName = "data.json", Boolean saveOnChange = true) {
            
            this.saveOnChange = saveOnChange;
            this.filePath = this.filePath = Path.Combine(AppDomain.CurrentDomain.BaseDirectory, "Datas", fileName); ;

            string json = File.ReadAllText(this.filePath);
            this.data = JsonSerializer.Deserialize<CalendarDataContainer>(json)!;
        }

        public List<CalendarModel> getCalendarsList()
        {
            return this.data.calendars;
        }

        public CalendarModel? getSelectedCalendar()
        {
            return this.data.widgetCalendar != -1 ? this.data.calendars[this.data.widgetCalendar] : null;
        }

        public void SelectCalendar(int id)
        {
            if (id >= this.data.calendars.Count()) 
            {
                throw new Exception("unexisting calendar");
            }

            this.data.widgetCalendar = id;

            if (this.saveOnChange)
            {
                this.Save();
            }
        }

        public void RemoveCalendar(int id)
        {
            if (id >= this.data.calendars.Count())
            {
                throw new Exception("unexisting calendar");
            }

            this.data.calendars.RemoveAt(id);

            if (this.saveOnChange)
            {
                this.Save();
            }
        }

        public void AddCalendar(CalendarModel calendar)
        {
            foreach (var element in this.data.calendars)
            {
                if (element.name == calendar.name)
                {
                    throw new Exception("calendar already exists");
                }
            }

            this.data.calendars.Add(calendar);

            if (this.saveOnChange)
            {
                this.Save();
            }
        }

        public void Save() {
            string json = JsonSerializer.Serialize(this.data);
            File.WriteAllText(filePath, json);
        }

        public void Dispose()
        {
            this.Save();
        }
    }
}
