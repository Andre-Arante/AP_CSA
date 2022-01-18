    /**
 * Write a description of class RentalSystemRunner here.
 *
 * @Andre Arante (your name)
 * @9.20.21
 */

public class Main
{
    public static void main(String[] args)
    {
        
        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        // Library operating hours
        String openingHours = "Libraries are open daily from 9am to 5pm.";

        // Add four books to the first library and two to the second.
        firstLibrary.addBook(new Book("The Grapes of Wrath", "John Steinbeck", "Fiction", 1939));
        firstLibrary.addBook(new Book("Jurassic Park", "Michael Crichton", "Sci-Fi", 1990));
        firstLibrary.addBook(new Book("The Catcher in the Rye", "J. D. Salinger", "Fiction", 1951));
        firstLibrary.addBook(new Book("The Curious Incident of the Dog in the Night-time", "Mark Haddon", "Mystery", 2003));
        secondLibrary.addBook(new Book("1984", "George Orwell", "Political Fiction", 1949));
        secondLibrary.addBook(new Book("The Glass Castle", "Jeanette Walls", "Memoir", 2005));

        // Print opening hours and the addresses
        System.out.println("Library hours:");
        System.out.println(openingHours);
        
        /* DO NOT EDIT ABOVE THIS LINE */




        
        System.out.println("\nLibrary addresses:");
        
        // print address for each library 
        firstLibrary.printAddress();
        secondLibrary.printAddress();

        
        // Print the titles of all available books from both libraries
        
        firstLibrary.printAvailableBooks();
        secondLibrary.printAvailableBooks();
        
        System.out.println("\nWhich book would you like to borrow? ");
        // Try to borrow Jurassic Park from both libraries
        firstLibrary.borrowBook("Jurassic Park");
        secondLibrary.borrowBook("Jurassic Park");

        // Print the titles of all available books from both libraries
        firstLibrary.printAvailableBooks();
        secondLibrary.printAvailableBooks();

        
        System.out.println("\nWhich book would you like to return? ");
        
        // Try to return Jurassic Park to the second library.
        // Then return Jurassic Park to the first library (3 days late)
        secondLibrary.returnBook("Jurassic Park", 0);
        firstLibrary.returnBook("Jurassic Park", 3);

        // Print the titles available from both libraries
        firstLibrary.printAvailableBooks();
        secondLibrary.printAvailableBooks();

    
    }
}
    