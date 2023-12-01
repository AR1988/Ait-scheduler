package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class Teacher extends User {


    private final List<Group> groups;

    public Teacher(String name) {
        super(name);
        this.role = Role.TEACHER;
        this.groups = new ArrayList<>();
    }

    public List<Group> getGroups() {
        return groups;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        Teacher teacher = (Teacher) object;

        return Objects.equals(groups, teacher.groups);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (groups != null ? groups.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "groups=" + groups +
                ", role=" + role +
                '}';
    }
}
