package model;

import java.time.LocalDateTime;
import java.util.Objects;

public class TimeSlot {

    private static int idCounter = 1000;
    private int id;

    private final Group group;
    private final Teacher teacher;
    private final LocalDateTime startTime;
    private final LocalDateTime endTime;

    public TimeSlot(Group group, Teacher teacher, LocalDateTime startTime, LocalDateTime endTime) {
        this.id = ++idCounter;
        this.group = group;
        this.teacher = teacher;
        this.startTime = startTime;
        this.endTime = endTime;
    }


    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        TimeSlot.idCounter = idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group getGroup() {
        return group;
    }

    public Teacher getTeacher() {
        return teacher;
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
        if (!Objects.equals(group, timeSlot.group)) return false;
        if (!Objects.equals(teacher, timeSlot.teacher)) return false;
        if (!Objects.equals(startTime, timeSlot.startTime)) return false;
        return Objects.equals(endTime, timeSlot.endTime);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (group != null ? group.hashCode() : 0);
        result = 31 * result + (teacher != null ? teacher.hashCode() : 0);
        result = 31 * result + (startTime != null ? startTime.hashCode() : 0);
        result = 31 * result + (endTime != null ? endTime.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TimeSlot{" +
                "id=" + id +
                ", group=" + group +
                ", teacher=" + teacher +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
