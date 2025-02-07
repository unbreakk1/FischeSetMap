package unbreakk1.ListToMapConversion;

import java.util.HashMap;
import java.util.Map;

public class School
{
    private Map<String, Student> students;

    public School()
    {
        students = new HashMap<>();
    }

    public void addStudent(Student student)
    {
        if (student != null)
        {
            // Add student with their ID as the key
            students.put(student.getId(), student);
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
            // Iterate over the values of the map to print students
            for (Student student : students.values())
            {
                System.out.println(student);
            }
        }
    }

    public Student findStudentById(String id)
    {
        // Find the student directly using their ID
        Student student = students.get(id);
        if (student != null)
            return student;
         else
        {
            System.out.println("Student with ID: " + id + " not found.");
            return null;
        }
    }

    public boolean removeStudentById(String id)
    {
        // Remove the student by ID and check if removal was successful
        Student removedStudent = students.remove(id);
        if (removedStudent != null)
        {
            System.out.println("Student with ID: " + id + " has been removed from the school.");
            return true;
        } else
        {
            System.out.println("Unable to remove student. No student with ID: " + id + " exists.");
            return false;
        }
    }

    public Map<String, Course> getStudentCoursesById(String studentId)
    {
        Student student = findStudentById(studentId);

        if (student != null)
            // Return the courses map directly
            return student.getCourses();
        else
        {
            System.out.println("Cannot retrieve courses. Student with ID " + studentId + " does not exist.");
            return new HashMap<>(); // Return an empty map if the student is not found
        }
    }


}
