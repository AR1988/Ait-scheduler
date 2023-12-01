package repo;

import model.Group;
import model.Student;
import model.Teacher;
import model.User;

import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public interface UserService {


    boolean add(User user);

    User addStudentToGroup(Student student, Group group);

    User findById(int userId);

    List<Teacher> findAllTeacher();

    List<Student> findAllUsers();

    Teacher findTeacherByName(String name);

    Student findStudentByName(String name);
}
