package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Group {

    private String name;

    private final List<Student> studentList;

    public Group(String name) {
        this.name = name;
        this.studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Group group = (Group) object;

        if (!Objects.equals(name, group.name)) return false;
        return studentList.equals(group.studentList);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + studentList.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", studentList=" + studentList +
                '}';
    }
}
