
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        
        // create new snapchat stock
        Stock snapchat = new Stock("Snapchat", "SNAP", 27.09);
        for(int d = 0; d <= 10; d++) {
            snapchat.printInfo();
        }
        
        
    }
}
