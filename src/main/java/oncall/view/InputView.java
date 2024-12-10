package oncall.view;

import static oncall.constant.InputConstant.*;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import oncall.model.StartDate;
import oncall.util.Parser;
import oncall.util.Validator;

public class InputView {

    public static StartDate readStartDate() {
        String input = input();
        List<String> separatedInput = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        String month = separatedInput.get(0);
        String day = separatedInput.get(1);
        Validator.validateNotNull(month);
        Validator.validateNumeric(month);
        int parsedMonth = Parser.convertStringToInt(month);
        Validator.validateMonth(parsedMonth);
        Validator.validateNotNull(day);
        Validator.validateDay(day);
        return StartDate.from(parsedMonth, day);
    }

    public static List<String> readWeekdayWorkers() {
        String input = input();
        List<String> workers = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        Validator.validateDuplicate(workers);
        Validator.validateWorkerCount(workers);
        for (String worker : workers) {
            Validator.validateNotNull(worker);
            Validator.validateMaxLength(worker, 5);
            Validator.validateNickname(worker);
        }
        return workers;
    }


    public static List<String> readHolidayWorkers() {
        String input = input();
        List<String> workers = Parser.separateBySeparator(input, INPUT_SEPARATOR.getContent());
        Validator.validateDuplicate(workers);
        Validator.validateWorkerCount(workers);
        for (String worker : workers) {
            Validator.validateNotNull(worker);
            Validator.validateMaxLength(worker, 5);
            Validator.validateNickname(worker);
        }
        return workers;
    }


    private static String input() {
        return Console.readLine();
    }
}
