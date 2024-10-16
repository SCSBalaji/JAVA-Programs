/**
 * Pattern_4
 */

/* Write a program to print the pattern with input from user
*
# #
* * *
# # # #
* * * * *

*/

import java.util.*;

public class Pattern_4 
{
    public static void main(String[] args) 
    {
        int number;             // Declare variable to store the number of rows

        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows:\t");
        number = sc.nextInt();          // Read the number of rows from the user

        for (int i = 1; i <= number; i++)           // Loop through rows
        {
            if (i % 2 != 0)             // For odd rows, print '*'
            {
                for (int j = 1; j <= i; j++)            // Loop through columns to print symbols for each row
                {
                    System.out.print("* ");          // Print '*' for odd rows
                }
            }
            else                // For even rows, print '#'
            {
                for (int j = 1; j <= i; j++)            // Loop through columns to print symbols for each row
                {
                    System.out.print("# ");          // Print '#' for even rows
                }
            }
            System.out.println();                   // Move to the next line after each row
        }
        sc.close();             // Close the scanner object to prevent resource leaks
    }
}