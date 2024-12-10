package oncall.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import oncall.model.Calendar;
import oncall.model.WeekOfDay;
import oncall.model.Date;
import oncall.model.Holiday;
import oncall.model.Schedule;
import oncall.model.StartDate;

public class OncallSerivce {

    public List<Schedule> assignWork(StartDate startDate, List<String> weekdayWorkers, List<String> holidayWorkers) {
        Queue<String> weekdayWorkersQueue = new LinkedList<>(weekdayWorkers);
        Queue<String> holidayWorkersQueue = new LinkedList<>(holidayWorkers);
        Calendar calendar = Calendar.findCalendar(startDate.getMonth());

        List<Date> dates = setUpDates(startDate, calendar);

        return schedules;
    }

    private static List<Date> setUpDates(StartDate startDate, Calendar calendar) {
        List<Date> dates = new ArrayList<>();
        for (int i = 1; i <= calendar.getMaxDay(); i++) {
            int startDayIndex = WeekOfDay.findIndex(startDate.getDay());
            Date date = Date.from(startDate.getMonth(), i, (WeekOfDay.findDay((startDayIndex + i - 1) % 7)));
            dates.add(date);
        }
        return dates;
    }
}
