package life.majiang.community.enums;

public enum NotificationTypeEnum {
    REPLY_QUESTION(1, "Reply question"),
    REPLY_COMMENT(2, "Relpy comment");
    private int type;
    private String name;


    public int getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    NotificationTypeEnum(int status, String name) {
        this.type = status;
        this.name = name;
    }

    public static String nameOfType(int type) {
        for (NotificationTypeEnum notificationTypeEnum : NotificationTypeEnum.values()) {
            if (notificationTypeEnum.getType() == type) {
                return notificationTypeEnum.getName();
            }
        }
        return "";
    }
}
