package repo;

import model.Group;
import model.TimeSlot;
import model.User;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class TimeSlotServiceImpl implements TimeSlotService {

    private List<TimeSlot> timeSlotServices = new ArrayList<>();

    @Override
    public boolean add(TimeSlot timeSlotService) {
        return timeSlotServices.add(timeSlotService);
    }

    @Override
    public List<TimeSlot> findByDate(LocalDateTime from, LocalDateTime to) {
        Predicate<TimeSlot> timeSlotPredicate = getTimeSlotPredicate(from, to);
        return timeSlotServices
                .stream()
                .filter(timeSlotPredicate)
                .collect(Collectors.toList());
    }

    @Override
    public List<TimeSlot> findByDateAndGroup(Group group, LocalDateTime from, LocalDateTime to) {
        if (group == null) {
            throw new IllegalArgumentException();
        }

        Predicate<TimeSlot> timeSlotPredicate = getTimeSlotPredicate(from, to);

        return timeSlotServices
                .stream()
                .filter(ts -> ts.getGroup().equals(group))
                .filter(timeSlotPredicate)
                .collect(Collectors.toList());
    }

    @Override
    public List<TimeSlot> findByDateAndUser(User user, LocalDateTime from, LocalDateTime to) {
        if (user == null) {
            throw new IllegalArgumentException();
        }

        Predicate<TimeSlot> timeSlotPredicate = getTimeSlotPredicate(from, to);

        return timeSlotServices
                .stream()
                .filter(ts -> ts.getTeacher().equals(user))
                .filter(timeSlotPredicate)
                .collect(Collectors.toList());
    }

    private static Predicate<TimeSlot> getTimeSlotPredicate(LocalDateTime from, LocalDateTime to) {
        return timeSlot -> (timeSlot.getStartTime().isAfter(from) || timeSlot.getStartTime().isEqual(from)) &&
                (timeSlot.getEndTime().isBefore(to) || timeSlot.getEndTime().isEqual(to));
    }
}
