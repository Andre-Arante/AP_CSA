import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    AddressBook book = new AddressBook();
    int action = 0;
    String fname, lname, mobile, work, email;
    
    while (action != 5) 
    {  
      System.out.println("Would you like to (1) add, (2) access, (3) show list, (4) delete or (5) exit? ");
      action = in.nextInt();
      in.nextLine();

      // Add
      if (action == 1) 
      {
        // Format name
        System.out.print("What is the name? ");
        String[] names = in.nextLine().split(" ", 2);

        System.out.print("Mobile: ");
        mobile = in.nextLine();

        System.out.print("Work: ");
        work = in.nextLine();

        System.out.print("Email: ");
        email = in.nextLine();

        Contact c = new Contact(names[0], names[1], work, mobile, email);
        book.add(c);
        
      }
      // Access
      if (action == 2) 
      {
        System.out.println("Number of contacts: " + book.getLength());
        book.printList();
      }
      // Show list
      if (action == 3) 
      {
        System.out.print("What is the name? ");
        String[] names = in.nextLine().split(" ", 2);

        if (book.getIndex(names[0], names[1]) != -1)
        {
         
           Contact c = book.get(names[0], names[1]);System.out.println(c.toString());
        }
        else 
        {
          System.out.println("Not found");
        }
      
      }

      // Delete
      if (action == 4) 
      {
        System.out.print("What is the name? ");
        String[] names = in.nextLine().split(" ", 2);

        if (book.getIndex(names[0], names[1]) != -1)
        {
          System.out.println("Are you sure, this action cannot be undone? (y/n)");
          String str = in.nextLine();

          if (str.equals("y")) 
          {
            book.remove(names[0], names[1]);
          }
        }
      }
    }
  }
}