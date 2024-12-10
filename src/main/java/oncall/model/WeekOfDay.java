package oncall.model;

public enum WeekOfDay {
    일(0, true),
    월(1, false),
    화(2, false),
    수(3, false),
    목(4, false),
    금(5, false),
    토(6, true),
    ;

    private final int index;
    private final boolean isHoliday;

    WeekOfDay(int index, boolean isHoliday) {
        this.index = index;
        this.isHoliday = isHoliday;
    }

    public int getIndex() {
        return index;
    }

    public boolean isHoliday() {
        return isHoliday;
    }

    public static String findDay(int index) {
        for (WeekOfDay weekOfDay : WeekOfDay.values()) {
            if (weekOfDay.getIndex() == index) {
                return weekOfDay.name();
            }
        }
        throw new IllegalArgumentException();
    }

    public static int findIndex(String day) {
        for (WeekOfDay weekOfDay : WeekOfDay.values()) {
            if (weekOfDay.name().equals(day)) {
                return weekOfDay.getIndex();
            }
        }
        throw new IllegalArgumentException();
    }

    public static boolean isHoliday(String day) {
        WeekOfDay weekOfDay = findDay(day);
        return weekOfDay.isHoliday;
    }

    private static WeekOfDay findDay(String day) {
        for (WeekOfDay weekOfDay : values()) {
            if (weekOfDay.name().equals(day)) {
                return weekOfDay;
            }
        }
        throw new IllegalArgumentException();
    }
}
