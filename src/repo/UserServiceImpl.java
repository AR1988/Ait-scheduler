package repo;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class UserServiceImpl implements UserService {

    List<User> users = new ArrayList<>();

    @Override
    public boolean add(User user) {
        return users.add(user);
    }

    @Override
    public User addStudentToGroup(Student student, Group group) {
        if (group != null) {
            group.getUsers().add(student);
            student.setUserGroup(group);
            return student;
        }
        throw new IllegalArgumentException("Group is null");
    }

    @Override
    public User findById(int userId) {
        return users.stream()
                .filter(user -> user.getId() == userId)
                .findFirst()
                .orElse(null);
    }


    @Override
    public List<Teacher> findAllTeacher() {
        return users.stream()
                .filter(user -> user instanceof Teacher)
                .map(user -> ((Teacher) user))
                .collect(Collectors.toList());
    }

    @Override
    public List<Student> findAllUsers() {
        return users.stream()
                .filter(user -> user instanceof Student)
                .map(user -> ((Student) user))
                .collect(Collectors.toList());
    }

    @Override
    public Teacher findTeacherByName(String name) {
        return users.stream()
                .filter(user -> Role.TEACHER.equals(user.getRole()))
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .map(Teacher.class::cast)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Student findStudentByName(String name) {
        return users.stream()
                .filter(user -> Role.STUDENT.equals(user.getRole()))
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .map(Student.class::cast)
                .findFirst()
                .orElse(null);
    }
}
