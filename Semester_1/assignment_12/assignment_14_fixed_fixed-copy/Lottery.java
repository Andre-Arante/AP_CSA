
/**
 * Write a description of class Lottery here.
 * 
 * @Andre Arante
 * @10.11.21
 */
public class Lottery
{
    private int n1, n2, n3, jackpot;
    private int w1, w2, w3;
    private int w = 0;

    /**
     * Constructor
     * Jackpot is initialized using the getJackpot method.
     * w1, w2, and w3 are initialized using the generateNum method.
     * 
     * @param first - first guess
     * @param second - second guess
     * @param third - third guess
     */
    public Lottery(int first, int second, int third)
    {
        n1 = first;
        n2 = second;
        n3 = third;
        
        w1 = generateNum();
        w2 = generateNum();
        w3 = generateNum();
    }
    
    
    /**
     * Checks the player's numbers against the winning numbers.
     * Calls printResult method and passes corresponding value.
     * 
     * @param none
     * @return none
     */
    public int checkMatch()
    {
        if (n1 == w1 || n1 == w2 || n1 == w3) {
            w++;
        } else if (n2 == w1 || n2 == w2 || n2 == w3) {
            w++;
        } else if (n3 == w1 || n3 == w2 || n3 == w3) {
            w++;
        }
        return w;

    }
    
    private int getW() {
        return w;
    }
    
    /* DO NOT EDIT BELOW THIS LINE */

    /**
     * Generates the jackpot.
     * 
     * @param none
     * @return an integer [1000, 9999]
     */
    private int getJackpot()
    {
        return (int) (10000 * Math.random() + 1000);
    }

    /**
     * Generates a random number.
     * 
     * @param none
     * @return an integer [1, 10]
     */
    public int generateNum()
    {
        int n = (int) (10 * Math.random()) + 1;
        
        while(n == w1 || n == w2)
        {
            n = (int) (10 * Math.random()) + 1;
        }
        
        return n;
    }

    /**
     * win = 3 means all three numbers matched.
     * win = 2 means two numbers matched.
     * win = 1 means one number matched.
     * win = 0 means no numbers matched.
     * 
     * @param win - the corresponding value for the result.
     * @return none
     * 
     */
    public void printResult(int win)
    {
        System.out.println("The winning numbers are: " + w1 + ", " + w2 + ", and " + w3);
        
        if(win == 3)
        {
            System.out.println("You win $" + jackpot + "!");
        }

        else if(win == 2)
        {
            System.out.println("You win $" + (jackpot / 2) + "!");
        }

        else if(win == 1)
        {
            System.out.println("You win $1!");
        }

        else 
        {
            System.out.println("You lost!");
        }
    }
}