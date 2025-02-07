package unbreakk1;

import java.util.ArrayList;
import java.util.List;

public class School
{
    private List<Student> students;

    public School()
    {
        students = new ArrayList<>();
    }

    public void addStudent(Student student)
    {
        if (student != null)
        {
            students.add(student);
            System.out.println(student.getFirstName() + " " + student.getLastName() + " has been added to the school.");
        } else
        {
            System.out.println("Invalid student! Cannot add.");
        }
    }


    public void printAllStudents()
    {
        if (students.isEmpty())
            System.out.println("No students in the school.");
         else
        {
            System.out.println("List of students in the school:");
            for (Student student : students)
            {
                System.out.println(student);
            }
        }
    }

    public Student findStudentById(String id)
    {
        for (Student student : students)
        {
            if (student.getId().equals(id))
                return student;

        }
        System.out.println("Student with ID: " + id + " not found.");
        return null;
    }

    public boolean removeStudentById(String id)
    {
        Student studentToRemove = findStudentById(id);
        if (studentToRemove != null)
        {
            students.remove(studentToRemove);
            System.out.println("Student with ID: " + id + " has been removed from the school.");
            return true;
        } else
        {
            System.out.println("Unable to remove student. No student with ID: " + id + " exists.");
            return false;
        }
    }

    public List<Course> getStudentCoursesById(String studentId)
    {
        Student student = findStudentById(studentId);
        if (student != null)
            return student.getCourses();
         else
         {
            System.out.println("Cannot retrieve courses. Student with ID " + studentId + " does not exist.");
            return new ArrayList<>(); // Return an empty list if student is not found
        }
    }
}
