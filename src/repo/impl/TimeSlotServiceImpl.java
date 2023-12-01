package repo.impl;

import model.Group;
import model.TimeSlot;
import model.User;
import repo.TimeSlotService;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class TimeSlotServiceImpl implements TimeSlotService {
    @Override
    public boolean add(TimeSlot timeSlotService) {
        return false;
    }

    @Override
    public List<TimeSlot> findByDate(LocalDateTime from, LocalDateTime to) {
        return null;
    }

    @Override
    public List<TimeSlot> findByDateAndGroup(Group group, LocalDateTime from, LocalDateTime to) {
        return null;
    }

    @Override
    public List<TimeSlot> findByDateAndUser(User user, LocalDateTime from, LocalDateTime to) {
        return null;
    }
}
