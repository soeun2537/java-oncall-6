package oncall.model;

public class Schedule {

    private Date date;
    private String name;

    private Schedule(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    public static Schedule from(Date date, String name) {
        return new Schedule(date, name);
    }

    public Date getDate() {
        return date;
    }

    public String getName() {
        return name;
    }
}
