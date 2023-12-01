package helpers;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public enum TeacherUserNames {
    TEACHER_USER_1("Alice Johnson"),
    TEACHER_USER_2("Bob Smith"),
    TEACHER_USER_3("Charlie Brown"),
    TEACHER_USER_4("David Lee"),
    TEACHER_USER_5("Eva Taylor");

    private final String displayName;

    TeacherUserNames(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
