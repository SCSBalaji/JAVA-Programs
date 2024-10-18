/**
 * Days_In_Month_Calculator
 */

/*Little Vicky often gets confused when trying to figure out
the number of days in a month based on the month his mother tells him. 
Your task is to help Vicky determine the number of days in a given month.

Sample input
7
2018

Sample output
31*/

import java.util.*;

public class Days_In_Month_Calculator 
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter month:\t");
        int month = s.nextInt();
        System.out.println("Enter Year:\t");
        int year = s.nextInt();
        
	    // Months with 31 days: Jan, Mar, May, Jul, Aug, Oct, Dec
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            System.out.print("31");
        }
        
	    // Months with 30 days: Apr, Jun, Sep, Nov
        if (month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.print("30");
        }

	    // February
        if (month == 2)
        {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))			// Leap year check
            {
                System.out.print("29");
            }
            else
            {
                System.out.print("28");
            }
        }
        s.close();          // Close the scanner object to prevent resource leaks
    }

}