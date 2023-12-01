import helpers.StudentUserNames;
import helpers.TeacherUserNames;
import model.*;
import repo.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class App {
    public static void main(String[] args) {
        GroupService groupService = new GroupServiceImpl();
        UserService userService = new UserServiceImpl();
        TimeSlotService timeSlotService = new TimeSlotServiceImpl();

        List<User> users = InitModules.init(groupService, userService);


        Teacher teacherByName1 = userService.findTeacherByName(TeacherUserNames.TEACHER_USER_1.getDisplayName());
        Student studentByName1 = userService.findStudentByName(StudentUserNames.STUDENT_USER_1.getDisplayName());

        Group group1 = groupService.findById(1);

        TimeSlot timeSlot1 = generateTimeSlot(group1,
                teacherByName1,
                LocalDateTime.of(2023, 12, 1, 9, 30),
                LocalDateTime.of(2023, 12, 1, 13, 0)
        );

        TimeSlot timeSlot2 = generateTimeSlot(group1,
                teacherByName1,
                LocalDateTime.of(2023, 12, 1, 9, 30),
                LocalDateTime.of(2023, 12, 1, 13, 0)
        );

        TimeSlot timeSlot3 = generateTimeSlot(group1,
                teacherByName1,
                LocalDateTime.of(2023, 12, 1, 9, 30),
                LocalDateTime.of(2023, 12, 1, 13, 0)
        );

        timeSlotService.add(timeSlot1);


        List<TimeSlot> timeSlots = timeSlotService.findByDate(LocalDateTime.of(2023, 12, 1, 9, 30), LocalDateTime.of(2023,
                12,
                1,
                13,
                0));


    }

    private static TimeSlot generateTimeSlot(Group group, Teacher teacher, LocalDateTime from, LocalDateTime to) {
        return new TimeSlot(
                teacher,
                group,
                from,
                to
        );
    }
}
