package oncall.model;

public enum Calendar {
    JANUARY(1, 31),
    FEBRUARY(2, 28),
    MARCH(3, 31),
    APRIL(4, 30),
    MAY(5, 31),
    JUNE(6, 30),
    JULY(7, 31),
    AUGUST(8, 31),
    SEPTEMBER(9, 30),
    OCTOBER(10, 31),
    NOVEMBER(11, 30),
    DECEMBER(12, 31),
    ;

    Calendar(int month, int maxDay) {
        this.month = month;
        this.maxDay = maxDay;
    }

    private final int month;
    private final int maxDay;

    public int getMonth() {
        return month;
    }

    public int getMaxDay() {
        return maxDay;
    }

    public static Calendar findCalendar(int month) {
        for (Calendar calendar : Calendar.values()) {
            if (calendar.getMonth() == month) {
                return calendar;
            }
        }
        throw new IllegalArgumentException();
    }
}
