package repo.impl;

import model.Group;
import model.Student;
import model.Teacher;
import model.User;
import repo.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class UserServiceImpl implements UserService {

    private List<User> users = new ArrayList<>();

    @Override
    public boolean add(User user) {
        return users.add(user);
    }

    @Override
    public User addStudentToGroup(Student student, Group group) {
        boolean contains = users.contains(student);
        if (contains) {
            student.setGroup(group);
            group.getStudentList().add(student);
            return student;
        } else {
            throw new IllegalArgumentException("Student " + student + " not found");
        }
    }

    @Override
    public User findById(int userId) {
        return null;
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return null;
    }

    @Override
    public List<Student> findAllUsers() {
        return null;
    }

    @Override
    public Teacher findTeacherByName(String name) {
        return users.stream()
                .filter(user -> user instanceof Teacher)            // фильтруем только учителей
                .map(user -> (Teacher) user)                        // приводим User к Teacher
                .filter(x -> x.getName().equalsIgnoreCase(name))    // фильтруем по условию
                .findFirst()
                .orElse(null);
    }

    @Override
    public Student findStudentByName(String name) {
        return users.stream()
                .filter(user -> user instanceof Student)            // фильтруем только студентов
                .map(user -> (Student) user)                        // приводим User к Student
                .filter(x -> x.getName().equalsIgnoreCase(name))    // фильтруем по условию
                .findFirst()
                .orElse(null);
    }
}
