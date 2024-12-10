package oncall.util;

import java.util.Arrays;
import java.util.List;

public class Parser {

    private Parser() {
    }

    public static List<String> separateBySeparator(String input, String separator) {
        return Arrays.asList(input.split(separator));
    }

    public static int convertStringToInt(String input) {
        return Integer.parseInt(input);
    }
}
