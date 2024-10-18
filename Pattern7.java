/**
 * Pattern7
 */

/*
WAP in java to get output in following pattern

case = 1
input = 5
output =
1
1 2
3 5 8
13 21 34 55
89 144 233 377 610

*/

import java.util.*;

public class Pattern7 {
    public static void main(String [] args)
    {
        int n, old = 0, number = 1, temp;           // Variables to store the number of rows, and Fibonacci sequence numbers

        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Rows:\t");
        n = sc.nextInt();
        
        for (int i = 1; i <= n; i++)            // Outer loop to control the rows
        {
            for (int j = 1; j <= i; j++)            // Inner loop to print numbers in each row
            {
                System.out.print(number + " ");         // Print the current Fibonacci number
                temp = old + number;            // Calculate the next Fibonacci number
                old = number;               // Update old to current number
                number = temp;              // Update current number to the new value
            }
            System.out.println();           // Move to the next line after each row
        }
        sc.close();             // Close the scanner object to prevent resource leaks
    }

}