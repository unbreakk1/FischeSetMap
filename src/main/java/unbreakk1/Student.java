package unbreakk1;

import java.util.ArrayList;
import java.util.Objects;
import java.util.List;

public class Student
{
    protected String firstName;
    protected String lastName;
    protected String id;

    private List<Course> courses;


    public Student()
    {
        courses = new ArrayList<>();
    }

    public Student(String firstName, String lastName, String id)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        courses = new ArrayList<>();

    }

    public void addCourse(Course course) {
        if (course != null) {
            courses.add(course);
            System.out.println("Course " + course.getCourseName() + " added to " + firstName + " " + lastName);
        } else {
            System.out.println("Invalid course! Cannot add.");
        }
    }

    // Getter for the courses list
    public List<Course> getCourses() {
        return courses;
    }


    //<editor-fold>desc="Getter & Setter">
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

    //<editor-fold>desc="toString, equals, hashCode">
    @Override
    public String toString()
    {
        return firstName + " " + lastName + " " + id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(id, student.id);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(firstName, lastName, id);
    }
    //</editor-fold>
}

