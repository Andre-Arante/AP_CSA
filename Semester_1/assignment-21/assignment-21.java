
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int i = 0;
        
        System.out.println("Max: ");
        int max = in.nextInt();
        System.out.println("Min: ");
        int min = in.nextInt();
        
        int rand = Game.generateNum(min, max);
        
        System.out.println("Enter your guess: ");
        int guess = in.nextInt();
        
        while(guess != rand) {
            if(guess > rand) { 
                System.out.println("Too high. Try again: "); 
                guess = in.nextInt();
                i++;
            }
            else if(guess < rand) { 
                System.out.println("Too low. Try again: ");
                guess = in.nextInt();
                i++;
            } else if(guess == rand) {
                break;
            }
            
        } 
        if(guess == rand) {
            if(i == 0) {
                String p = "";
            }
            String p = "es";
            System.out.println("You got it! It took " + i + " guess" +  p + ".");
        }
        
    }
}
