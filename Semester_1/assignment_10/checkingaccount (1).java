/**
 * CheckingAccount models a bank account and can
 * simulate time passing, as well as taking
 * deposits and withdrawls.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class CheckingAccount {
    // Private instance variables
    private double myBalance = 0;
    private double rate = 0;
    private String accountName = "";
    private int age;

    /**
     * Create account with starting balance bal, interest rate r, owner own
     * Remember to initialize all class variables.
     */
    public CheckingAccount(double bal, double r, String own)
    {
        myBalance = bal;
        rate = r;
        accountName = own;
    }
    
    /**
     * Create account with owner given, but without an initial deposit
     * Remember to initialize all class variables (set rate = 0.001).
     */
    public CheckingAccount(String own)
    {
        accountName = own;
        rate = 0;
        myBalance = 0;
    }

    /**
     * Get the balance (getter)
     * 
     * @return returns the current balance in the account
     */
    public double getBalance()
    {
        return myBalance;
    }
    
    /**
     * Get the account owner (getter)
     * 
     * @return returns the name of the owner on the account
     */
    public String getOwner() 
    {
        return accountName;
    }
    
    /**
     * Get the interest rate (getter)
     * 
     * @return returns the interest rate for the account (as a decimal)
     */
    public double getRate()
    {
        return rate;
    }
    
    /**
     * Get the account age (getter)
     * 
     * @return returns the number of months account has been open
     */
    public int getAge() 
    {
        return age;
    }
    
    /**
     * Deposits some money into the account (amount > 0)
     * 
     * @param amount - the amount of money to be deposited into the account
     */
    public void processDeposit(double amount)
    {
        myBalance = myBalance + amount;
    }
    
    /**
     * Withdraws some money into the account (amount > 0)
     * 
     * @param amount - the amount of money to be taken out of the account
     */ 
    public void processWithdrawal(double amount)
    {
        myBalance = myBalance - amount;
    }
    
    /**
     * Simulates a month passing.
     *
     * 
     * A = P * (1 + (rate / 12))
     * 
     * P is current ammount
     * A is new amount after interest is added.
     */
    public void runMonth()
    { 
        /* Interest is added to balance and acctAge is incremented by one
         * A = P * (1 + (rate / compounds))
         * P is current ammount in the account
         * A is new amount after interest is added */
        
        
        // Add your code...
        myBalance = myBalance * (1 + (rate / 12));
        age = age + 1;
    }
    
    /**
     * The account info (age, owner, rate, balance) is printed.
     */
    public void printInfo()
    {
        System.out.println("Checking Account: " + accountName + "(" + age + " months old)");
        System.out.println("Rate: " + rate * 100 + "%");
        System.out.println("Owner: " + accountName);
        System.out.println("Balance: " + myBalance);
    }


    /* DO NOT EDIT BELOW THIS LINE */

    /**
     * Simulate multiple months at once.
     *
     * @param n - the number of months to run.
     */
    public void runMultMonths(int n)
    {
        for(int i = 0; i < n; i++)
        {
            runMonth();
        }
    }
}