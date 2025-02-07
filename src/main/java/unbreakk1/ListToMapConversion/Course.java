package unbreakk1.ListToMapConversion;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Course
{
    private String courseName;
    private String instructor;
    private String room;

    // Adding a HashMap to track enrolled students
    private Map<String, Student> enrolledStudents;

    // Constructor
    public Course(String courseName, String instructor, String room)
    {
        this.courseName = courseName;
        this.instructor = instructor;
        this.room = room;
        this.enrolledStudents = new HashMap<>();
    }

    // Method to enroll a student
    public void enrollStudent(Student student)
    {
        if (student != null)
        {
            enrolledStudents.put(student.getId(), student);
            System.out.println("Student " + student.getFirstName() + " " + student.getLastName() + " enrolled in " + courseName);
        } else
        {
            System.out.println("Invalid student! Cannot enroll.");
        }
    }

    // Method to remove a student by ID
    public boolean removeStudentById(String studentId)
    {
        if (enrolledStudents.remove(studentId) != null)
        {
            System.out.println("Student with ID " + studentId + " removed from " + courseName);
            return true;
        } else
        {
            System.out.println("No student with ID " + studentId + " found in " + courseName);
            return false;
        }
    }

    // Method to find a student by ID
    public Student findStudentById(String studentId) {
        Student student = enrolledStudents.get(studentId);
        if (student != null)
            return student;
        else
        {
            System.out.println("Student with ID " + studentId + " not found in " + courseName);
            return null;
        }
    }

    // Getter for enrolled students
    public Map<String, Student> getEnrolledStudents()
    {
        return enrolledStudents;
    }

    //<editor-fold desc="Getters & Setters">
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

    // Equals and hashCode methods
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
