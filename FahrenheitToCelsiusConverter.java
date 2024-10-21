/**
 * FahrenheitToCelsiusConverter
 */

/* Udith was suffering from fever from the last two days.
His mother was monitoring health condition by observing body temperature.
Doctor told his mother to bring him to hospital when temperature goes beyond hundread degree Celsius.

your task is to help udith's mother to update temperature in degrees.

Note:read only Fahrenheit value from the user.
sample data:
input=32
output=0
*/

import java.util.*;

public class FahrenheitToCelsiusConverter {
    public static void main(String [] args)
    {
        float farenheit, degrees;           // Variable declarations

        Scanner sc = new Scanner(System.in);            // Creating a Scanner object to read input from user
        System.out.println("Enter Temperature in Fahrenheit:\t");
        farenheit = sc.nextFloat();

        degrees = (farenheit - 32) * 5 / 9;         // Convert Fahrenheit to Celsius

        System.out.println(degrees);

        sc.close();                 // Close the scanner to avoid resource leakage
    }

}