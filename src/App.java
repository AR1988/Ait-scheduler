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

    }

//    private static TimeSlot generateTimeSlot(Group group, Teacher teacher, LocalDateTime from, LocalDateTime to) {
//        return new TimeSlot(
//                teacher,
//                group,
//                from,
//                to
//        );
//    }
}
