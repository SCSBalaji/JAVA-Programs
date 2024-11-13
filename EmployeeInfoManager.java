/**
 * Problem Statement:
 * 
 * Develop a Java program to manage employee information. The program should:
 * 1. Prompt the user to enter the employee's ID, name, and salary.
 * 2. Store the entered information in an Employee object.
 * 3. Display the stored employee information.
 * 
 * The program should use a class named `Employee` with the following attributes:
 * - `id` (int): The employee's ID.
 * - `name` (String): The employee's name.
 * - `salary` (int): The employee's salary.
 * 
 * The `Employee` class should have the following methods:
 * - `get()`: Prompts the user to enter the employee's ID, name, and salary, and stores them in the respective attributes.
 * - `put()`: Displays the employee's ID, name, and salary.
 * 
 * The main method should create an instance of the `Employee` class, call the `get()` method to input employee details, and then call the `put()` method to display the details.
 */

import java.util.*;

class Emplayee {
    int id;
    String name;
    int salary;

    /**
     * Prompts the user to enter the employee's ID, name, and salary.
     * Uses a Scanner to read input from the console.
     */
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID: ");
        id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        name = sc.next();
        System.out.println("Enter Employee Salary: ");
        salary = sc.nextInt();

        sc.close();
    }

    /**
     * Displays the employee's ID, name, and salary to the console.
     */
    public void put() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }
}

/**
 * The EmployeeInfoManager class contains the main method to run the program.
 * It creates an instance of the Emplayee class, inputs employee details, and displays them.
 */
public class EmployeeInfoManager {
    public static void main(String[] args) {
        Emplayee e = new Emplayee();
        e.get();
        e.put();
    }
}
