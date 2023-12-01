package model;

import helpers.TeacherUserNames;

import java.time.LocalDateTime;
import java.util.Objects;

public class TimeSlot {
    private static int idCounter = 1000;

    private final int id;
    private final Teacher teacher;
    private final Group group;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    /**
     * Constructs a new TimeSlot.
     *
     * @param teacherId The identifier of the teacher associated with the time slot.
     * @param groupId   The identifier of the group associated with the time slot.
     * @param startTime The start time of the time slot.
     * @param endTime   The end time of the time slot.
     */
    public TimeSlot(Teacher teacher, Group group, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = ++idCounter;
        this.teacher = teacher;
        this.group = group;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public static void setIdCounter(int idCounter) {
        TimeSlot.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public Group getGroup() {
        return group;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        TimeSlot timeSlot = (TimeSlot) object;

        if (id != timeSlot.id) return false;
        if (!Objects.equals(teacher, timeSlot.teacher)) return false;
        if (!Objects.equals(group, timeSlot.group)) return false;
        if (!Objects.equals(startTime, timeSlot.startTime)) return false;
        return Objects.equals(endTime, timeSlot.endTime);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "id=" + id +
                ", teacher=" + teacher +
                ", group=" + group +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
