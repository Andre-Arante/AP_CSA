
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main {
     
    public static void main(String[] args)
    {
        
        // create new snapchat stock
        Stock snapchat = new Stock("Snapchat", "SNAP", 27.09);
        Stock cloudera = new Stock("Cloudera", "CLDR", 15.0);
        for(int d = 0; d <= 10; d++) {
            snapchat.runDay();
            snapchat.printInfo();
            cloudera.runDay();
            cloudera.printInfo();
        }
        
        
    }
}
