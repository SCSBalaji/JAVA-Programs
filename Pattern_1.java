/**
 * Pattern_1
 */

/* Write a program to print the pattern with input from user
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

import java.util.*;

public class Pattern_1 
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
            for (int j = 1; j <= i; j++)            // Loop through columns to print numbers for each row
            {
                System.out.print(j + " ");          // Print numbers in increasing order
            }
            System.out.println();                   // Move to the next line after each row
        }
        sc.close();             // Close the scanner object
    }
}