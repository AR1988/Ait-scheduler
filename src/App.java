import helpers.TeacherUserNames;
import model.Group;
import model.Teacher;
import model.TimeSlot;
import model.User;
import repo.GroupService;
import repo.TimeSlotService;
import repo.UserService;
import repo.impl.GroupServiceImpl;
import repo.impl.TimeSlotServiceImpl;
import repo.impl.UserServiceImpl;

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

        List<User> users = InitModels.init(groupService, userService);
        Teacher teacherByName = userService.findTeacherByName(TeacherUserNames.TEACHER_USER_4.getDisplayName());


        Group groupById4 = groupService.findById(5004);
        Group groupById5 = groupService.findById(5001);
        TimeSlot timeSlot = generateTimeSlot(
                groupById4,
                teacherByName,
                LocalDateTime.of(2023, 12, 1, 9, 30),
                LocalDateTime.of(2023, 12, 1, 13, 0)
        );

        TimeSlot timeSlot2 = generateTimeSlot(
                groupById4,
                teacherByName,
                LocalDateTime.of(2023, 12, 4, 15, 30),
                LocalDateTime.of(2023, 12, 4, 17, 0)
        );


        TimeSlot timeSlot3 = generateTimeSlot(
                groupById4,
                teacherByName,
                LocalDateTime.of(2023, 12, 4, 9, 30),
                LocalDateTime.of(2023, 12, 4, 13, 0)
        );

        TimeSlot timeSlot4 = generateTimeSlot(
                groupById5,
                teacherByName,
                LocalDateTime.of(2023, 12, 4, 15, 30),
                LocalDateTime.of(2023, 12, 4, 17, 0)
        );


        //ctrl + d - копирование строки
        TimeSlotService timeSlotService = new TimeSlotServiceImpl();
        timeSlotService.add(timeSlot);
        timeSlotService.add(timeSlot2);
        timeSlotService.add(timeSlot3);
        timeSlotService.add(timeSlot4);

        List<TimeSlot> byDateTodayAndGroupId4 = timeSlotService.findByDateAndGroup(groupById5,
                LocalDateTime.of(2023, 12, 3, 0, 0),
                LocalDateTime.of(2023, 12, 6, 23, 59)
        );

//        byDateTodayAndGroupId4.stream().forEach(App::printTimeSlotDetails);
        byDateTodayAndGroupId4.stream().forEach(ts -> printTimeSlotDetails(ts));
    }

    private static void printTimeSlotDetails(TimeSlot timeSlot) {
        System.out.printf("Group id: %d, group name: %s, start-time: %s end-time: %s, teacher name: %s \n",
                timeSlot.getGroup().getId(), timeSlot.getGroup().getName(), timeSlot.getStartTime(), timeSlot.getEndTime(), timeSlot.getTeacher().getName());
    }

    private static TimeSlot generateTimeSlot(Group group, Teacher teacher, LocalDateTime from, LocalDateTime to) {
        return new TimeSlot(
                group,
                teacher,
                from,
                to
        );
    }
}
