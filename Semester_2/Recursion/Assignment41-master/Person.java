/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private String name;
    private String number;
    private String email;

    public Person(String name, String number, String email)
    {
        this.name = name;
        this.number = number;
        this.email = email;
    }

    /**
     * @return name of this Person.
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return number of this Person.
     */
    public String getNumber()
    {
        return number;
    }

    /**
     * @return email of this Person.
     */
    public String getEmail()
    {
        return email;
    }

    @Override
    public String toString()
    {
        return (name + "\nNumber: " + getNumber() + "\nEmail: " + getEmail());
    }
}
