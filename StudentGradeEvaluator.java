/**
 * StudentGradeEvaluator
 */

/*A teacher wants to evaluate the performance of her students based on their scores in a recent exam. 
Your task is to read a student's score  and then assigns a letter grade according to the following criteria:
A: 75 to 100
B: 50 to 74
C: 35 to 49
F: Below 35
The program should then display the corresponding letter grade for the student based on their score.
Note: If the score is not between 0 and 100, display "Invalid Score."

sample data:
input
78
output
A

Sample Data:
input
107
output
Invalid Score

*/

import java.util.*;

public class StudentGradeEvaluator {
    public static void main(String [] args)
    {
        Scanner s = new Scanner(System.in);
	    System.out.println("Enter the student's score:");
        int marks = s.nextInt();
        
        // Assign a grade based on the score
        if (marks <= 100 && marks >= 75)
        {
            System.out.println("A");
        }

        else if (marks <= 74 && marks >= 50)
        {
            System.out.println("B");
        }

        else if (marks <= 49 && marks >= 35)
        {
            System.out.println("C");
        }

        else if (marks < 35 && marks >= 0)
        {
            System.out.println("F");
        }

        else
        {
            System.out.println("Invalid Score");        // Display an error message if the score is outside the valid range
        }

        s.close();          // Close the scanner object to prevent resource leaks
    }

}