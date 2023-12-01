package repo.impl;

import model.Group;
import model.Student;
import model.Teacher;
import model.User;
import repo.UserService;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class UserServiceImpl implements UserService {
    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public User addStudentToGroup(Student student, Group group) {
        return null;
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
        return null;
    }

    @Override
    public Student findStudentByName(String name) {
        return null;
    }
}
