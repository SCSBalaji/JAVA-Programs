

import java.util.*;
public class LeapYearChecker 
{
    public static void main(String[] args) 
    {
        int year; // Variable to store the year input by the user

        Scanner sc = new Scanner(System.in); // Create a Scanner object for input

        System.out.println("Enter the year: "); // Prompt the user to enter a year
        year = sc.nextInt(); // Read the year input by the user

        // Check if the year is a century year
        if (year % 100 == 0) 
        {
            // If it is a century year, check if it is divisible by 400
            if (year % 400 == 0) 
            {
                System.out.println(year + " is a leap year."); // If divisible by 400, it is a leap year
            } 
            else 
            {
                System.out.println(year + " is not a leap year."); // If not divisible by 400, it is not a leap year
            }
        } 
        else 
        {
            // If it is not a century year, check if it is divisible by 4
            if (year % 4 == 0) 
            {
                System.out.println(year + " is a leap year."); // If divisible by 4, it is a leap year
            } 
            else 
            {
                System.out.println(year + " is not a leap year."); // If not divisible by 4, it is not a leap year
            }
        }
        sc.close(); // Close the Scanner object
    }
}