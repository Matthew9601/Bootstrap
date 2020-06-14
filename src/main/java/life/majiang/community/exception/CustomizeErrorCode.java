package life.majiang.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUND(2001, "Can not find the question!"),
    TARGET_PARAM__NOT_FOUND(2001, "Have not selected questions!"),
    NOT_LOGIN(2003, "Not log in!"),
    SYS_ERROR(2004, "Server Error!"),
    TYPE_PARAM_WRONG(2005, "comment error!"),
    COMMENT_NOT_FOUND(2006, "comment not found!"),
    CONTENT_IS_EMPTY(2007, "reply cannot be empty!");

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }

    private Integer code;
    private String message;

    CustomizeErrorCode(Integer code, String message){
        this.message = message;
        this.code = code;
    }
}
