/**
 * It provides methods to get the book details from the user and display them.
 * The Book class represents a book with an ID, name, and cost.
 * It provides methods to get the book details from the user and display them.
 */
import java.util.*;
class Book {
    int id;
    String name;
    float cost;

    /**
     * Prompts the user to enter the ID, name, and cost of the book.
     * Uses a Scanner to read the input from the console.
     */
    public void get() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID of the book: ");
        id = sc.nextInt();

        System.out.println("Enter the name of the book: ");
        name = sc.next();

        System.out.println("Enter the cost of the book: ");
        cost = sc.nextFloat();

        sc.close();
    }

    /**
     * Displays the ID, name, and cost of the book.
     */
    public void put() {
        System.out.println("ID of book = " + id);
        System.out.println("Name of book = " + name);
        System.out.println("Cost of book = " + cost);
    }
}

/**
 * The BookInfoManager class contains the main method to run the program.
 * It creates an instance of the Book class, gets the book details from the user, and displays them.
 */
public class BookInfoManager {
    public static void main(String[] args) {
        Book b = new Book();
        b.get();
        b.put();
    }
}
