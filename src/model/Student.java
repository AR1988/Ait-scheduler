package model;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class Student extends User{

    private Group userGroup;

    public Student(String name) {
        super(name);
        this.role = Role.STUDENT;
    }

    public Group getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(Group userGroup) {
        this.userGroup = userGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "userGroup=" + userGroup +
                ", role=" + role +
                '}';
    }
}
