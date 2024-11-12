
/**
 * This program defines a class `Student` with attributes `id`, `name`, and `per` (percentage).
 * It includes methods to get data from the user and display the data.
 * In the `main` method, two `Student` objects are created, and their data is input and displayed.
 */

import java.util.*;

class Student
{
    int id; // Attribute to store the student's ID
    String name; // Attribute to store the student's name
    float per; // Attribute to store the student's percentage

    /**
     * Method to get data from the user.
     * It prompts the user to enter the student's ID, name, and percentage.
     */
    public void getData()
    {
        Scanner sc = new Scanner(System.in); // Scanner object to read input from the user

        System.out.println("Enter the ID of the student: ");
        id = sc.nextInt(); // Read the student's ID

        System.out.println("Enter the name of the student: ");
        name = sc.next(); // Read the student's name

        System.out.println("Enter the percentage of the student: ");
        per = sc.nextFloat(); // Read the student's percentage
    }

    /**
     * Method to display the student's data.
     * It prints the student's ID, name, and percentage.
     */
    public void putData()
    {
        System.out.println("ID of student = " + id); // Print the student's ID
        System.out.println("Name of student = " + name); // Print the student's name
        System.out.println("Percentage of student = " + per); // Print the student's percentage
    }    
}

public class StudentInfoManager
{
    /**
     * The main method where the program execution begins.
     * It creates two `Student` objects, inputs their data, and displays the data.
     */
    public static void main(String[] args) 
    {
        Student s1 = new Student(); // Create the first Student object
        s1.getData(); // Get data for the first student
        s1.putData(); // Display data for the first student

        Student s2 = new Student(); // Create the second Student object
        s2.getData(); // Get data for the second student
        s2.putData(); // Display data for the second student

    }
}
