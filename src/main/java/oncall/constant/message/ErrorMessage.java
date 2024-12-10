package oncall.constant.message;

public enum ErrorMessage {

    INVALID_FORMAT("유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    ;

    private static final String PREFIX = "[ERROR] ";
    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return PREFIX + message;
    }
}
