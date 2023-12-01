package model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private static int idCounter = 0;

    private final int id;
    private final String groupName;
    private final List<User> users;
    private final List<TimeSlot> timeSlots;

    public Group(String groupName) {
        this.id = ++idCounter;
        this.groupName = groupName;
        this.users = new ArrayList<>();
        this.timeSlots = new ArrayList<>();
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Group.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<TimeSlot> getTimeSlots() {
        return timeSlots;
    }
}
