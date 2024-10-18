/**
 * Pattern2
 */

/* Write a program to print the pattern with input from user
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.*;

public class Pattern2 
{
    public static void main(String[] args) 
    {
        int number, value = 1;             // Declare variables: 'number' for rows, 'value' for sequential printing

        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows:\t");
        number = sc.nextInt();          // Read the number of rows from the user

        for (int i = 1; i <= number; i++)           // Loop through rows
        {
            for (int j = 1; j <= i; j++)            // Loop through columns to print numbers for each row
            {
                System.out.print(value + " ");          // Print the sequential value
                value++;            // Increment the value for each number printed
            }
            System.out.println();                   // Move to the next line after each row
        }
        sc.close();             // Close the scanner object to prevent resource leaks
    }
}