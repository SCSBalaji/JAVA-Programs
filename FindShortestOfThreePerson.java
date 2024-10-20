/**
 * FindShortestOfThreePerson
 */

/*A,B and C are three friends, out of three members X want to find shortest person among all of them.
your task is to help X person to find shortest person among A,B and c

Note: Read heights of 3 persons from keyboard
Sample Test Cases:
Input:
5
7
4
output:
4

Input:
6
5
7
output:
5*/

import java.util.*;

public class FindShortestOfThreePerson {
    public static void main(String [] args)
    {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);

        num1 = sc.nextInt();
        num2 = sc.nextInt();
        num3 = sc.nextInt();

        // Determine the shortest person
        if (num1 < num2)
        {
            if (num1 < num3)
            {
                System.out.println(num1);
            }
            else
            {
                System.out.println(num3);
            }
        }
        else
        {
            if (num2 < num3)
            {
                System.out.println(num2);
            }
            else
            {
                System.out.println(num3);
            }
        }
    sc.close();
    }
}