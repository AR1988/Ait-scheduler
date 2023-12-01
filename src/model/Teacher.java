package model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class Teacher extends User {

    private final List<Group> teachGroups = new ArrayList<>();

    public Teacher(String name) {
        super(name);
        this.role = Role.TEACHER;

    }

    public List<Group> getTeachGroups() {
        return teachGroups;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "teachGroups=" + teachGroups +
                ", role=" + role +
                '}';
    }
}
