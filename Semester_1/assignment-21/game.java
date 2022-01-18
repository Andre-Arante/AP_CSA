
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Game
{
    /**
     * Generates a random number.
     * 
     * @return an integer [min, max]
     */
    public static int generateNum(int min, int max)
    {
        return (int) (max * Math.random()) + min;
    }
    
    /**
     * Checks if user is correct
     * 
     * @returns true if user is right
     */
    public static boolean isRight(int guess, int m)
    {
        if(guess == m) {
            return true;
        }
        return false;
    }
    
    /**
     * Finds hi / lo
     * 
     * @returns high if user is over, low if user is under
     */
    public static String dif (int guess, int m)
    {
        return guess > m ? "High" : "Low";
    }
}
