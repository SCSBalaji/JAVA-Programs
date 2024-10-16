/* Write a program to print the following pattern for any given positive integer 'n'

Sample :
input = 5
output =
*
#*#
*#*#*
#*#*#*#
*#*#*#*#*

Sample 2:
input = 6
output =
*
#*#
*#*#*
#*#*#*#
*#*#*#*#*
#*#*#*#*#*#


*/

import java.util.*;

public class Pattern_6
{
    public static void main(String [] args)
    {
        int number;             // Declare a variable to store the number of rows

        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows:\t");
        number = sc.nextInt();              // Read the number of rows from the user

        for (int i = 1; i <= number; i++)               // Loop through the rows
        {
            for (int j = 1; j <= (2 * i) - 1; j++)                // Loop through the columns in each row
            {
                 if (i % 2 != 0)                // For odd rows
                 {
                     if (j % 2 != 0)           // Print '*' for odd positions and '#' for even positions
                     {
                         System.out.print("* ");
                     }
                     else
                     {
                         System.out.print("# ");
                     }
                 }
                 else               // For even rows
                 {
                     if (j % 2 != 0)            // Print '#' for odd positions and '*' for even positions
                     {
                         System.out.print("# ");
                     }
                     else
                     {
                         System.out.print("* ");
                     }
                 }
            }
            System.out.println();               // Move to the next line after each row
        }
        sc.close();                 // Close the scanner object to prevent resource leaks
    }

}