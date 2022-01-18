
/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your three numbers: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        Lottery l = new Lottery(n1, n2, n3);
        
        // make sure each number is between 0 and 9.
        // make sure no numbers are the same.
        if (n1 == n2 || n2 == n3 || n3 == n1) {
          System.out.println("Numbers must be different");  
        } else if(n1 < 0 
                || n2 < 0 
                || n3 < 0
                || n1 > 9
                || n2 > 9
                || n3 > 9) {
            System.out.println("Number must be between 0 and 9");
        } else {
        // otherwise, play the game    
            int win = l.checkMatch();
            l.generateNum();
            l.printResult(win);
 
        }
    }
}