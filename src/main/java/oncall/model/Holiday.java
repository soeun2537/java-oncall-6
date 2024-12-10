package oncall.model;

public enum Holiday {
    NEW_YEAR_DAY(1, 1),
    INDEPENDENCE_MOVEMENT_DAY(3, 1),
    CHILDREN_DAY(5, 5),
    MEMORIAL_DAY(6, 6),
    LIBERATION_DAY(8, 15),
    NATIONAL_FOUNDAtiON_DAY(10,3),
    HANGUL_DAY(10, 9),
    CHRISTMAS(12, 25),
    ;

    private int month;
    private int day;

    Holiday(int month, int day) {
        this.month = month;
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public static boolean isHoliday(int month, int day) {
        for (Holiday holiday : values()) {
            if (holiday.getMonth() == month && holiday.getDay() == day) {
                return true;
            }
        }
        return false;
    }
}
