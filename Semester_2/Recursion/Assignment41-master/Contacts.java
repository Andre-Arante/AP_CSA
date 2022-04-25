/**
 * Contacts is modelling a collection of people's information.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;

public class Contacts
{
    private List<Person> people;

    public Contacts()
    {
        people = new ArrayList<Person>();
        
        try
        {
            addFromFile("people.txt");
        }
        catch(IOException e)
        {
            System.out.println("Error reading Contacts from file.");
        }
    }

    /** 
     * Person with given name, number, and email are added to list and list is sorted.
     *
     * @param name - name of Person to be added
     * @param number - phone number of Person to be added
     * @param email - email of Person to be added
     */
    public void addPerson(String name, String number, String email)
    {
        // create a Person object and add it to the list (people)
        // sort list
        Person p = new Person(name, number, email);
        this.people.add(p);
        sortContacts();
    }

    /**
     * Reads lines from file to add to list.
     *
     * @param file - name of file to be read
     */
    private void addFromFile(String file) throws IOException
    {
        Scanner inFile = new Scanner(new File(file));

        while(inFile.hasNext())
        {
            String line = inFile.nextLine();
            people.add(new Person(grabName(line), grabNum(line), grabEmail(line)));
        }

        inFile.close();

        sortContacts();
    }

       /**
     * @param line - Info in the form "name, number, email" 
     * @return the name from the line (value before first comma) and null if nothing is found
     */
    public static String grabName(String line)
    {
        int idx = line.indexOf(',');
        return line.substring(0, idx);
    }

    /**
     * @param line - Info in the form "name, number, email"
     * @return the phone number from the line (value between commas) and null if nothing is found
     */
    public static String grabNum(String line)
    {
        int first_comma = line.indexOf(',')+3;
        String cut_name = line.substring(first_comma);
        return cut_name.substring(0, cut_name.indexOf(','));

    }

    /**
     * @param line - Info in the form "name, number, email"
     * @return the email from the line (value after second comma) and null if nothing is found
     */
    public static String grabEmail(String line)
    {   
        int first_comma = line.indexOf(',');
        String cut_name = line.substring(first_comma)+3;
        int second_comma = cut_name.indexOf(',')+3;
        String final_string = cut_name.substring(second_comma);
        int idx = final_string.indexOf(',')+3;
        return final_string.substring(idx);
    }

    /** 
     * @param name - the name of the Person to be found
     * @return Person in the list with the name given using binary search and null if not found
     */
    public Person getContact(String name)
    {
        int start = 0;
        int end = people.size() - 1;
        
        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (name.equals(people.get(mid).getName()))
            {
                return people.get(mid);
            }
            int compare = name.compareTo(people.get(mid).getName());
            if (compare<0)
            {
                end = mid - 1;
            }

            else
            {
                start = mid + 1;
            }
        }
        return null;
    }

    /**
     * people is sorted in ascending order using insertion sort
     */
    public void sortContacts()
    {
        Person temp;

        for (int i = 1; i < people.size(); i++)
        {
            for (int j = i; j > 0; j--)
            {
                String n1 = people.get(j).getName();
                String n2 = people.get(j-1).getName();
                if(n1.compareTo(n2)<0)
                {
                    temp = people.get(j);
                    people.set(j, people.get(j-1));
                    people.set(j-1, temp);
                }
            }
        }
    }

    @Override
    public String toString()
    {
        String list = "";

        // enhanced for-loop; for-each loop
        for(Person p: people)
        {
            list += p.getName() + ", " + p.getNumber() + ", " + p.getEmail() + "\n";
        }

        return list;
    }
}
