package oncall.util;

import static oncall.constant.InputConstant.*;
import static oncall.constant.message.ErrorMessage.INVALID_FORMAT;

import java.util.ArrayList;
import java.util.List;

public class Validator {

    private Validator() {
    }

    public static void validateNotNull(String input) {
        if (input == null || input.isBlank()) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateNumeric(String input) {
        if (!input.matches(NUMERIC_PATTERN.getContent())) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateMonth(int input) {
        if (input < 1 || input > 12) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateDay(String input) {
        if (!input.matches(DAY_PATTERN.getContent())) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateNickname(String input) {
        if (!input.matches(NICKNAME_PATTERN.getContent())) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateDuplicate(List<String> inputs) {
        List<String> uniqueInputs = new ArrayList<>();
        for (String input : inputs) {
            if (uniqueInputs.contains(input)) {
                throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
            }
            uniqueInputs.add(input);
        }
    }

    public static void validateMaxLength(String input, int maxLength) {
        if (input.length() > maxLength) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }

    public static void validateWorkerCount(List<String> inputs) {
        if (inputs.size() < 5 || inputs.size() > 35) {
            throw new IllegalArgumentException(INVALID_FORMAT.getMessage());
        }
    }
}
