/**
 * Write a description of class Runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.io.IOException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Contacts contacts = new Contacts();
        boolean run = true;
        Scanner in = new Scanner(System.in);

        while(run)
        {
            System.out.print("1: Find contact\n2: Add contact\n3: List contacts ");
            int choice = in.nextInt();

            while(choice < 1 || choice > 3)
            {
                System.out.print("Unknown command.\n1: Find contact\n2: Add contact\n3: List contacts ");
                choice = in.nextInt();
            }

            if(choice == 1)
            {
                System.out.print("Enter the name: ");
                in.nextLine();
                String name = in.nextLine();
                Person p = contacts.getContact(name);

                if(p != null)
                {
                    System.out.println(p);
                }

                else
                {
                    System.out.println("Person not found.");
                }
            }

            else if(choice == 2)
            {
                System.out.println("Enter name, then number, then email.");
                in.nextLine();
                String name = in.nextLine();
                String number = in.next();
                String email = in.next();
                contacts.addPerson(name, number, email);
            }

            else if(choice == 3)
            {
                System.out.println(contacts);
            }

            System.out.print("Enter 0 to quit or 1 to complete another action. ");
            choice = in.nextInt();

            while(choice != 0 && choice != 1)
            {
                System.out.print("Unknown command.\nEnter 0 to quit or 1 to complete another action. ");
                choice = in.nextInt();
            }

            if(choice == 0)
            {
                System.out.println("Goodbye!");
                run = false;
            }
        }
    }
}
