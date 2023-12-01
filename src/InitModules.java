import helpers.StudentUserNames;
import helpers.TeacherUserNames;
import model.Group;
import model.Student;
import model.Teacher;
import model.User;
import repo.GroupService;
import repo.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class InitModules {

    public static final String TEACHER_MAX_MUSTERMANN = "Max Mustermann";
    public static final String STUDENT_MAX_MUSTERMAMN = "Vasja Pupkin";

    public static List<User> init(GroupService groupService, UserService userService) {
        List<User> users = new ArrayList<>();

        int groupCounter = 30;
        // Генерируем 5 групп
        for (TeacherUserNames tn : TeacherUserNames.values()) {
            Group group = new Group("Группа " + groupCounter++);
            groupService.add(group);

            // Генерируем 10 учеников и добавляем их в группу
            for (StudentUserNames sn : StudentUserNames.values()) {
                Student student = new Student(sn.getDisplayName());
                userService.add(student);
                userService.addStudentToGroup(student, group);
                users.add(student);
            }

            // Генерируем 10 временных слотов для учителя и добавляем их
            Teacher teacher = new Teacher(tn.getDisplayName());
            userService.add(teacher);
            users.add(teacher);
        }

        return users;
    }
}
