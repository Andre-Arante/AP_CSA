import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Library here.
 *
 * @author 
 * @version 
 */

public class Library
{
    // Instance variables
    private String address;
    private final double FINE = 0.25;
    private List<Book> catalog = new ArrayList<>();
    private String bookTitle;
    private int overdueDays;
    private boolean rented = false;

    /**
     * Constructs a new Library object with given address.
     *
     * @param a - library's address as String
     */
    // Add your implementation here
    public Library (String a) 
    {
        address = a;
    }


    /**
     * getAddress
     * 
     * Get the address of this Library
     *
     * @return the address of this Library 
     */
    // Add your implementation here
    
    public void printAddress() {
        System.out.println(address);
    }

    public void returnBook(String title, int daysLate) {
        System.out.println("You have succesfully returned " + title + "");
        System.out.println("Your book was " + daysLate + " late. You owe $" + (FINE * daysLate));
    }





    
    /* DO NOT EDIT ANYTHING BELOW HERE */
    
    
    /**
     * Book object is added to catalog
     *
     * @param book - Book object being added
     *
     */
    public void addBook(Book book)
    {
        catalog.add(book);
    }

    /**
     * Prints to console whether book is already rented, if it is not in the catalog, or if it has been rented successfully.
     *
     * @param title - title of book
     *
     */
    public void borrowBook(String title)
    {
        for(int i = 0; i < catalog.size(); i++)
        {
            if(title.equalsIgnoreCase(catalog.get(i).getTitle()))
            {
                if(catalog.get(i).isBorrowed())
                {
                    System.out.println("\"" + catalog.get(i).getTitle() + "\" is already rented from "
                            + this);

                    return;
                }

                else
                {
                    System.out.println("You successfully rented \"" + catalog.get(i).getTitle() + "\" from " + this);
                    catalog.get(i).rentBook();
                    return;
                }
            }
        }

        System.out.println("\"" + title + "\" is not in the catalog at " + this);
    }

    /**
     * Prints to console whether no books are in the catalog or prints the list of books (and says if they are currently rented).
     */
    public void printAvailableBooks()
    {
        if(catalog.size() == 0)
        {

            return;
        }

        System.out.println("List of books at " + this + ":");
        for(int i = 0; i < catalog.size(); i++)
        {
            if(catalog.get(i).isBorrowed())
            {
                System.out.println("\"" + catalog.get(i) + "\" -- OUT OF STOCK");
            }

            else
                System.out.println("\"" + catalog.get(i) + "\"");
        }
    }
}