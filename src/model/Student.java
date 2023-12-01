package model;

import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class Student extends User {

    /**
     * группа, к которой принадлежит студент
     */
    private Group group;

    public Student(String name) {
        super(name);
        this.role = Role.STUDENT;
    }


    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Student student = (Student) object;

        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (group != null ? group.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group=" + group.getId() + " " + group.getName() +
                ", role=" + role +
                '}';
    }
}
