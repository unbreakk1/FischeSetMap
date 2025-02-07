package unbreakk1;

import java.util.List;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Wanda", "Waffles", "S001"));
        students.add(new Student("Tommy", "Tickles", "S002"));
        students.add(new Student("Betty", "Bubbles", "S003"));
        students.add(new Student("Freddy", "Fizzlepop", "S004"));
        students.add(new Student("Larry", "Lemonpants", "S005"));

        //<editor-fold>desc="BONUS">
        School school = new School();

        // Add students school
        Student student1 = new Student("Wanda", "Waffles", "S001");
        Student student2 = new Student("Tommy", "Tickles", "S002");

        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Math 101", "Prof. Euler", "Room A1");
        Course course2 = new Course("Physics 101", "Dr. Einstein", "Room B2");
        Course course3 = new Course("Chemistry 101", "Dr. Curie", "Room C3");

        // Add courses to students
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course3);


        System.out.println("\nCourses of Wanda Waffles:");
        for (Course course : school.getStudentCoursesById("S001"))
        {
            System.out.println(course);
        }

        System.out.println("\nCourses of Tommy Tickles:");
        for (Course course : school.getStudentCoursesById("S002"))
        {
            System.out.println(course);
        }
        //</editor-fold>
        //<editor-fold>desc="BONUS BEUTEL">
        Beutel beutel = new Beutel();

        beutel.add("Apple");
        beutel.add("Banana");
        beutel.add("Cherry");

        System.out.println("Size: " + beutel.size()); // Output: 3
        System.out.println(beutel.get(1)); // Output: Banana

        beutel.removeLast();
        System.out.println("Size after removing last: " + beutel.size()); // Output: 2

        beutel.removeByIndex(0);
        System.out.println("Size after removing index 0: " + beutel.size()); // Output: 1

        System.out.println(beutel.contains("Banana")); // Output: true
        //</editor-fold>
    }
}


