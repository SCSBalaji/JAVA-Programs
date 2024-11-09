/**
 * This program defines a Student class and demonstrates how to create an instance of the class,
 * assign values to its fields, and print the student's information.
 */

// The Student class represents a student with an ID, name, and percentage.
class Student
{
    int id;
    String name;
    float per;
}
public class StudentInfoPrinterUsingSeparateClass
{
    public static void main(String[] args) 
    {
        // Create a new Student object
        Student s = new Student();

        // Assign values to the Student object's fields
        s.id = 101; // Set student ID
        s.name = "Rahul"; // Set student name
        s.per = 95.68f; // Set student percentage
        
        // Print the student's ID
        System.out.println("ID of student = " + s.id);
        // Print the student's name
        System.out.println("Name of student = " + s.name);
        // Print the student's percentage
        System.out.println("Percentage of student = " + s.per);
    }
}