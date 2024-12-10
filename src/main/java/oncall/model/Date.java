package oncall.model;

import oncall.constant.OncallConstant;

public class Date {

    private int month;
    private int day;
    private String dayOfWeek;

    private Date(int month, int day, String dayOfWeek) {
        this.month = month;
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    public static Date from(int month, int day, String dayOfWeek) {
        return new Date(month, day, dayOfWeek);
    }

    public void addHolidayMark() {
        dayOfWeek = getDayOfWeek() + OncallConstant.holidayMark;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }
}
