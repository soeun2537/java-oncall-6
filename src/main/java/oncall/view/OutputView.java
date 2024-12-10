package oncall.view;

import static oncall.constant.message.OutputMessage.*;

import java.util.List;
import oncall.model.Schedule;

public class OutputView {

    public static void printStartDateGuidance() {
        print(START_DATE_GUIDANCE.getMessage());
    }

    public static void printWeekdayWorkersGuidance() {
        print(WEEKDAY_WORKER_GUIDANCE.getMessage());
    }

    public static void printHolidayWorkersGuidance() {
        print(HOLIDAY_WORKER_GUIDANCE.getMessage());
    }

    public static void printSchedule(List<Schedule> schedules) {
        printNewLine();
        for (Schedule schedule : schedules) {
            println(WORK_SCHEDULE.getMessage(
                    schedule.getDate().getMonth(),
                    schedule.getDate().getDay(),
                    schedule.getDate().getDayOfWeek(),
                    schedule.getName()));
        }
    }

    public static void printErrorMessage(RuntimeException e) {
        println(e.getMessage());
    }

    private static void print(String content) {
        System.out.print(content);
    }

    private static void println(String content) {
        System.out.println(content);
    }

    private static void printNewLine() {
        System.out.print(System.lineSeparator());
    }
}
