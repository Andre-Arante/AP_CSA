/**
 * This class runs the program for managing a checking account.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Main {
    public static void main(String[] args) {

        // create CheckingAccount object with starting deposit of
        // $1000, 1.2% interest rate, and an account owner.
        CheckingAccount king = new CheckingAccount(1000.0, 0.012, "Mr. King");

        // create CheckingAccount object with an account owner (no initial deposit).
        CheckingAccount carell = new CheckingAccount("Carrel, Steve");
        
        // print account info for both accounts
        king.printInfo();
        carell.printInfo();
        
        // make one month pass for both accounts
        king.runMultMonths(1);
        carell.runMultMonths(1);
        // print account info for both accounts
        king.printInfo();
        carell.printInfo();
        
        // make three months pass for both accounts
        king.runMultMonths(3);
        carell.runMultMonths(3);
        
        // deposit $300 into both accounts
        king.processDeposit(300);
        carell.processDeposit(300);
        
        // make eight months pass for both accounts
        king.runMultMonths(8);
        carell.runMultMonths(8);
        
        // print account info for both accounts
        king.printInfo();
        carell.printInfo();
        
        // withdraw $75 from both accounts
        king.processWithdrawal(75);
        carell.processWithdrawal(75);
        
        // print account info for both accounts
        king.printInfo();
        carell.printInfo();
    }
}