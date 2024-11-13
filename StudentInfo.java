/**
 * This program defines a class `StudentInfo` that stores and displays information about a student.
 * The information includes the student's ID, name, and percentage.
 * The program prompts the user to input these details, stores them in an instance of `StudentInfo`,
 * and then displays the stored information.
 */

import java.util.Scanner;

public class StudentInfo 
{
    int id;
    String name;
    float per;

    /**
     * Sets the data for the student.
     */
    public void getData(int i, String n, float p) {
        id = i;
        name = n;
        per = p;
    }

    /**
     * Displays the data of the student.
     */
    public void putData() {
        System.out.println("Id of student = " + id);
        System.out.println("Name of student = " + name);
        System.out.println("Percentage of student = " + per);
    }

    /**
     * The main method is the entry point of the program.
     * It prompts the user to enter the student's ID, name, and percentage,
     * then creates a Test object, sets the data, and displays it.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i;
        String n;
        float p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID:");
        i = sc.nextInt();
        System.out.println("Enter Student Name:");
        n = sc.next();
        System.out.println("Enter Student Percentage");
        p = sc.nextFloat();
        StudentInfo s = new StudentInfo();
        s.getData(i, n, p);
        s.putData();
        sc.close();
    }
}