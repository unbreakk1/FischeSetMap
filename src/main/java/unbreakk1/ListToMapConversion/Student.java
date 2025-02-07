package unbreakk1.ListToMapConversion;

import java.util.*;

public class Student
{
    protected String firstName;
    protected String lastName;
    protected String id;

    // Replacing List<Course> with a HashMap
    private Map<String, Course> courses;

    public Student()
    {
        courses = new HashMap<>();
    }

    public Student(String firstName, String lastName, String id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        courses = new HashMap<>();
    }

    public void addCourse(Course course)
    {
        if (course != null)
        {
            // Insert the course into the HashMap with course name as the key
            courses.put(course.getCourseName(), course);
            System.out.println("Course " + course.getCourseName() + " added to " + firstName + " " + lastName);
        } else
        {
            System.out.println("Invalid course! Cannot add.");
        }
    }

    public boolean removeCourseByName(String courseName)
    {
        if (courses.remove(courseName) != null)
        {
            System.out.println("Course " + courseName + " removed from " + firstName + " " + lastName);
            return true;
        } else
        {
            System.out.println("Course " + courseName + " not found for " + firstName + " " + lastName);
            return false;
        }
    }

    public Course findCourseByName(String courseName)
    {
        // Retrieve the course directly by key
        Course course = courses.get(courseName);
        if (course != null)
            return course;
        else
        {
            System.out.println("Course " + courseName + " not found for " + firstName + " " + lastName);
            return null;
        }
    }

    // Getter for the courses map
    public Map<String, Course> getCourses()
    {
        return courses;
    }

    //<editor-fold desc="Getter & Setter">
    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }
    //</editor-fold>

    //<editor-fold desc="toString, equals, hashCode">
    @Override
    public String toString()
    {
        return firstName + " " + lastName + " " + id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) &&
                Objects.equals(lastName, student.lastName) &&
                Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }
    //</editor-fold>

}

