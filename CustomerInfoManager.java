/**
 * This program is designed to manage customer information. It allows the user to input
 * customer details such as ID, name, and purchase amount, and then displays these details.
 * The program demonstrates basic input and output operations in Java, as well as the use
 * of classes and objects to encapsulate data and behavior.
 */
import java.util.*;

class Customer {
    int id;
    String name;
    int purchase;

    /**
     * Prompts the user to enter customer details (ID, name, and purchase amount)
     * and stores them in the respective fields.
     */
    public void get() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer ID: ");
        id = sc.nextInt();
        System.out.println("Enter Customer Name: ");
        name = sc.next();
        System.out.println("Enter Purchase Amount: ");
        purchase = sc.nextInt();

        sc.close();
    }

    /**
     * Displays the customer details (ID, name, and purchase amount) to the console.
     */
    public void put() {
        System.out.println("Customer ID: " + id);
        System.out.println("Customer Name: " + name);
        System.out.println("Purchase Amount: " + purchase);
    }
}

/**
 * The CustomerInfoManager class contains the main method to run the application.
 * It creates an instance of the Customer class, gets customer details from the user,
 * and displays them.
 */
public class CustomerInfoManager {
    public static void main(String[] args) {
        Customer c = new Customer();
        c.get();
        c.put();
    }
}
