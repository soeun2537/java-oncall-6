package oncall.constant;

public enum InputConstant {
    NUMERIC_PATTERN("\\d+"),
    DAY_PATTERN("^(월|화|수|목|금|토|일)$"),
    NICKNAME_PATTERN("^[가-힣]+$"),
    INPUT_SEPARATOR(","),
    ;

    private final String content;

    InputConstant(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
