package oncall.model;

public class StartDate {

    private int month;
    private String day;

    private StartDate(int month, String day) {
        this.month = month;
        this.day = day;
    }

    public static StartDate from(int month, String day) {
        return new StartDate(month, day);
    }

    public int getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }
}
