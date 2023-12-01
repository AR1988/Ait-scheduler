package repo.impl;

import model.Group;
import model.TimeSlot;
import model.User;
import repo.TimeSlotService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Andrej Reutow
 * created on 01.12.2023
 */
public class TimeSlotServiceImpl implements TimeSlotService {

    private List<TimeSlot> timeSlots = new ArrayList<>();

    @Override
    public boolean add(TimeSlot timeSlot) {
        return timeSlots.add(timeSlot);
    }

    @Override
    public List<TimeSlot> findByDate(LocalDateTime from, LocalDateTime to) {
        return timeSlots.stream()
                .filter(ts -> ts.getStartTime().equals(from) || ts.getStartTime().isAfter(from))
                .filter(ts -> ts.getEndTime().equals(to) || ts.getEndTime().isBefore(to))
                .collect(Collectors.toList());
    }

    @Override
    public List<TimeSlot> findByDateAndGroup(Group group, LocalDateTime from, LocalDateTime to) {
        return timeSlots.stream()
                .filter(ts -> ts.getGroup().equals(group))
                .filter(ts -> ts.getStartTime().equals(from) || ts.getStartTime().isAfter(from))
                .filter(ts -> ts.getEndTime().equals(to) || ts.getEndTime().isBefore(to))
                .collect(Collectors.toList());
    }

    @Override
    public List<TimeSlot> findByDateAndUser(User user, LocalDateTime from, LocalDateTime to) {
        return timeSlots.stream()
                .filter(ts -> ts.getTeacher().equals(user))
                .filter(ts -> ts.getStartTime().equals(from) || ts.getStartTime().isAfter(from))
                .filter(ts -> ts.getEndTime().equals(to) || ts.getEndTime().isBefore(to))
                .collect(Collectors.toList());
    }
}
