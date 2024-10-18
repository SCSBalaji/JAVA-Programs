/**
 * DiscountCalculator
 */

/*Etansha goes shopping at her favorite store, where different 
discount rates are offered based on the total amount she spends:
    For purchases under 1000: no discount.
    For purchases between 1000 and 5000: a 12% discount.
    For purchases over 5000: a 23% discount.
Help Etansha to input the total amount of her purchase and 
then calculates and displays the final amount after applying 
the appropriate discount and 5% state and 8% central tax.

sample input1:
800
output:
904

sample input2:
3700
output:
3679.28

*/
import java.util.*;

public class DiscountCalculator {
    public static void main(String []args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Amount:\t");
        double amount = s.nextDouble();
        
        // Apply discount based on the total amount spent
        if (amount >= 5000)
        {
            amount = amount - (amount * 0.23);          // If amount is 5000 or more, apply a 23% discount
        }

        else if (amount >= 1000)           // If amount is between 1000 and 4999, apply a 12% discount
        {
            amount = amount - (amount * 0.12);
        }
        // No discount if the amount is less than 1000

        double bill = amount + amount * 0.05 + amount * 0.08;           // Calculate the final bill by adding 5% state tax and 8% central tax
        
        System.out.print(bill);         // Print the final amount after applying discount and taxes

        s.close();          // Close the scanner object to prevent resource leaks
    }
}