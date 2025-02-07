package unbreakk1;

import java.util.Objects;

public class Course
{
    private String courseName;
    private String instructor;
    private String room;

    // Constructor
    public Course(String courseName, String instructor, String room) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
    }



    //<editor-fold>desc="Getters & Setters">
    public String getCourseName()
    {
        return courseName;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }

    public String getInstructor()
    {
        return instructor;
    }

    public void setInstructor(String instructor)
    {
        this.instructor = instructor;
    }

    public String getRoom()
    {
        return room;
    }

    public void setRoom(String room)
    {
        this.room = room;
    }
    //</editor-fold>

    @Override
    public String toString()
    {
        return courseName + " (Instructor: " + instructor + ", Room: " + room + ")";
    }

    // Equals and hashCode methods (if needed for removing courses or avoiding duplicates)
    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(courseName, course.courseName) &&
                Objects.equals(instructor, course.instructor) &&
                Objects.equals(room, course.room);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(courseName, instructor, room);
    }

}
