package oncall.controller;

import java.util.List;
import oncall.model.Schedule;
import oncall.model.StartDate;
import oncall.service.OncallSerivce;
import oncall.view.InputView;
import oncall.view.OutputView;

public class OncallController {

    private final OncallSerivce oncallSerivce;

    public OncallController(OncallSerivce oncallSerivce) {
        this.oncallSerivce = oncallSerivce;
    }

    public void run() {
        StartDate startDate = readStartDate();
        List<String> weekdayWorkers = readWeekdayWorkers();
        List<String> holidayWorkers = readHolidayWorkers();

        List<Schedule> schedules = oncallSerivce.assignWork(startDate, weekdayWorkers, holidayWorkers);
        OutputView.printSchedule(schedules);
    }

    private StartDate readStartDate() {
        while (true) {
            try {
                OutputView.printStartDateGuidance();
                return InputView.readStartDate();
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private List<String> readWeekdayWorkers() {
        while (true) {
            try {
                OutputView.printWeekdayWorkersGuidance();
                return InputView.readWeekdayWorkers();
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }

    private List<String> readHolidayWorkers() {
        while (true) {
            try {
                OutputView.printHolidayWorkersGuidance();
                return InputView.readHolidayWorkers();
            } catch (RuntimeException e) {
                OutputView.printErrorMessage(e);
            }
        }
    }
}
