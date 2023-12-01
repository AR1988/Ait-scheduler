package helpers;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public enum StudentUserNames {
    STUDENT_USER_1("Frank Williams"),
    STUDENT_USER_2("Grace Davis"),
    STUDENT_USER_3("Henry Harris"),
    STUDENT_USER_4("Ivy Clark"),
    STUDENT_USER_5("Jack Turner"),
    STUDENT_USER_6("Katherine Martin"),
    STUDENT_USER_7("Leo Rodriguez"),
    STUDENT_USER_8("Mia Wilson"),
    STUDENT_USER_9("Nathan Anderson"),
    STUDENT_USER_10("Olivia Martinez"),
    STUDENT_USER_11("Peter White"),
    STUDENT_USER_12("Quinn Adams"),
    STUDENT_USER_13("Rachel Hall"),
    STUDENT_USER_14("Samuel Young"),
    STUDENT_USER_15("Tara Lewis"),
    STUDENT_USER_16("Sophia White"),
    STUDENT_USER_17("William Johnson"),
    STUDENT_USER_18("Ava Smith"),
    STUDENT_USER_19("James Brown"),
    STUDENT_USER_20("Olivia Lee"),
    STUDENT_USER_21("Benjamin Taylor"),
    STUDENT_USER_22("Emma Davis"),
    STUDENT_USER_23("Lucas Harris"),
    STUDENT_USER_24("Lily Clark"),
    STUDENT_USER_25("Alexander Turner"),
    STUDENT_USER_26("Avery Martin"),
    STUDENT_USER_27("Elijah Rodriguez"),
    STUDENT_USER_28("Scarlett Wilson"),
    STUDENT_USER_29("Henry Anderson"),
    STUDENT_USER_30("Zoe Martinez"),
    STUDENT_USER_31("Matthew White"),
    STUDENT_USER_32("Aria Adams"),
    STUDENT_USER_33("Jackson Hall"),
    STUDENT_USER_34("Madison Young"),
    STUDENT_USER_35("Sebastian Lewis"),
    STUDENT_USER_36("Chloe White"),
    STUDENT_USER_37("Ethan Johnson"),
    STUDENT_USER_38("Grace Smith"),
    STUDENT_USER_39("Liam Brown"),
    STUDENT_USER_40("Ella Lee");

    private final String displayName;

    StudentUserNames(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
