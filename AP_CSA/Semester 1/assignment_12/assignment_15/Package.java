
public class Package
{
    // instance variables
    private int weight;
    private int width;
    private int height;
    private int length;
    private int girth;

    /**
     * Initialize all instance variables and length should be the largest dimension.
     */
    public Package(int we, int dim1, int dim2, int dim3)
    {
        weight = we;
        width = dim1;
        height = dim2;
        length = dim3;
    }


    // methods

    /**
     * This will print a message explaining if it is valid or why it isn't.
     */
    public void validate()
    {
        if (!isLegalWeight()) System.out.println("Package girth + length cannot be more than 100 inches");

        else if (!isLegalSize()) System.out.println("Package weight cannot exceed 70 pounds");
        
        else if (isLegalSize() && isLegalWeight()) System.out.println("You're all good to go");
    }


    // helper methods

    /**
     * @return returns true if weight is less than or equal to 70, false otherwise.
     */
    private boolean isLegalWeight()
    {
        return weight < 70;
    }

    /**
     * @return returns true if sum of length and girth is less than or equal to 100, false otherwise.
     */
    private boolean isLegalSize()
    {
        return length + calculateGirth() < 100;
    }

    /**
     * @return the girth, which is 2*W + 2*H.
     */
    private int calculateGirth()
    {
        return(2 * height + 2 * width);        
    }
}