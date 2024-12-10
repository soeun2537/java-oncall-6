package oncall.constant.message;

public enum OutputMessage {
    START_DATE_GUIDANCE("비상 근무를 배정할 월과 시작 요일을 입력하세요> "),
    WEEKDAY_WORKER_GUIDANCE("평일 비상 근무 순번대로 사원 닉네임을 입력하세요> "),
    HOLIDAY_WORKER_GUIDANCE("휴일 비상 근무 순번대로 사원 닉네임을 입력하세요> "),

    WORK_SCHEDULE("%d월 %d일 %s %s"),
    ;

    private final String message;

    OutputMessage(String message) {
        this.message = message;
    }

    public String getMessage(Object... args) {
        return String.format(message, args);
    }
}
