package unbreakk1.ListToMapConversion;

public class Main
{
    public static void main(String[] args)
    {
        // Create the School object
        School school = new School();

        // Create and add students to the school
        Student student1 = new Student("Wanda", "Waffles", "S001");
        Student student2 = new Student("Tommy", "Tickles", "S002");
        Student student3 = new Student("Betty", "Bubbles", "S003");

        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Print all students in the school
        System.out.println("\nList of all students in the school:");
        school.printAllStudents();

        // Create courses
        Course course1 = new Course("Math 101", "Prof. Euler", "Room A1");
        Course course2 = new Course("Physics 101", "Dr. Einstein", "Room B2");
        Course course3 = new Course("Chemistry 101", "Dr. Curie", "Room C3");

        // Add courses to students
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course3);

        // Print all courses for a specific student
        System.out.println("\nCourses for Wanda Waffles:");
        for (Course course : student1.getCourses().values())
        { // Iterate over the courses map
            System.out.println(course);
        }

        System.out.println("\nCourses for Tommy Tickles:");
        for (Course course : student2.getCourses().values())
        {
            System.out.println(course);
        }

        // Enroll students in courses directly from the Course class
        course1.enrollStudent(student1);
        course2.enrollStudent(student1);
        course3.enrollStudent(student2);

        // Print students enrolled in a specific course
        System.out.println("\nStudents enrolled in Math 101:");
        for (Student student : course1.getEnrolledStudents().values())
        {
            System.out.println(student);
        }

        System.out.println("\nStudents enrolled in Physics 101:");
        for (Student student : course2.getEnrolledStudents().values())
        {
            System.out.println(student);
        }

        // Find a student by ID and print the details
        System.out.println("\nFinding student with ID S002:");
        Student foundStudent = school.findStudentById("S002");
        if (foundStudent != null)
        {
            System.out.println(foundStudent.toString());
        }

        // Remove a course from a student
        System.out.println("\nRemoving course 'Physics 101' from Wanda Waffles:");
        student1.removeCourseByName("Physics 101");

        // Print Wanda's courses after removal
        System.out.println("\nWanda's courses after removal:");
        for (Course course : student1.getCourses().values())
        {
            System.out.println(course);
        }

        // Remove a student from the school
        System.out.println("\nRemoving student with ID S003 (Betty Bubbles):");
        school.removeStudentById("S003");

        // Print all students in the school after removal
        System.out.println("\nList of all students in the school after removal:");
        school.printAllStudents();
    }
}


