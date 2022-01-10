/**
 * This class represents a stock on the stock market.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Stock
{
    private String symbol;
    private String name;
    private double hiPrice;  // all-time high price
    private double loPrice;  // all-time low price
    private double currentPrice;
    private double prevPrice;  // price of this Stock yesterday
    private int daysSinceIPO;  // days since first day on market

    /**
     * Constructor: initialize ALL class variables (7).
     *
     * @param n - name
     * @param s - symbol
     * @param p - price
     */
    public Stock(String n, String s, double p)
    {
        // add your implementation here...
        name = n;
        symbol = s;
        currentPrice = p;
        prevPrice = p;
    }

    /**
     * getPercChange
     *
     * change = (prev - new) / prev
     * 
     * @param none
     * @return the percent change from prevPrice to currentPrice (as a decimal)
     */
     // add your implementation here...
    public double getPercChange() 
    {
        double change = (prevPrice - currentPrice) / prevPrice;
        change *= -1;
        return change;
    }






    /**
     * runDay
     *
     * Updates the price, updates the hi and lo prices, increments the daysSinceIPO by one (add one)
     *
     * @param none
     * @return none
     */
     // add your implementation here...
     public void runDay() {
            this.updatePrice();
             this.updateHiLo();
             daysSinceIPO++;
        }



    /**
     * updateHiLo
     *
     * Updates the hi and lo all-time prices of this Stock (if necessary).
     *
     * @param none
     * @return none
     */
    // add your implementation here...
    public void updateHiLo() {
        // set high price
        if(currentPrice > prevPrice) {
            hiPrice = currentPrice;
        } else {
            hiPrice = prevPrice;
        }
        
        // set low price
        if(currentPrice < prevPrice) {
            loPrice = currentPrice;
        } else {
            loPrice = prevPrice;
        }
        
        //set hi/low if prices are equal
        if (currentPrice == prevPrice) {
            hiPrice = currentPrice;
            loPrice = currentPrice;
        }
    }








    /* DO NOT CHANGE ANY CODE BELOW THIS LINE */


    /**
     * Prints the info about this Stock to the console.
     *
     * @param none
     * @return none
     */
    public void printInfo()
    {
        System.out.println(name + " (" + symbol + ")");
        System.out.println("Opening price: " + (Math.round(prevPrice * 100.0) / 100.0));
        System.out.println("Closing price: " + (Math.round(currentPrice * 100.0) / 100.0));
        System.out.println("Percent change: " + (Math.round(getPercChange() * 10000.0) / 100.0) + "%");
        System.out.println("All-time high: " + (Math.round(hiPrice * 100.0) / 100.0));
        System.out.println("All-time low: " + (Math.round(loPrice * 100.0) / 100.0));
        System.out.println("Days since IPO: " + daysSinceIPO + "\n\n");
    }

    /**
     * Updates the price of this Stock.
     *
     * @param none
     * @return none
     */
    private void updatePrice()
    {
        prevPrice = currentPrice;
        double chance = Math.random();

        if(chance < 0.1)
        {
            double inc = 1.0 + Math.random() / 8.0 + 0.08;
            currentPrice *= inc;
        }

        else if(chance < 0.55)
        {
            double inc = 1.0 + Math.random() / 10.0;
            currentPrice *= inc;
        }

        else if(chance < 0.9)
        {
            double dec = Math.random() / 10.0 + 0.9;
            currentPrice *= dec;
        }

        else
        {
            double dec = Math.random() / 8.0 + (7.0/8.0);
            currentPrice *= dec;
        }
    }
}
