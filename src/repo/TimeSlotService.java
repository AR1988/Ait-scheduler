package repo;

import model.Group;
import model.TimeSlot;
import model.User;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public interface TimeSlotService {


    boolean add(TimeSlot timeSlotService);

    List<TimeSlot> findByDate(LocalDateTime from, LocalDateTime to);

    List<TimeSlot> findByDateAndGroup(Group group, LocalDateTime from, LocalDateTime to);

    List<TimeSlot> findByDateAndUser(User user, LocalDateTime from, LocalDateTime to);
}
