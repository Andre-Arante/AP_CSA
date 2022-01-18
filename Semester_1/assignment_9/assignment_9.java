/**
 * This program does a few number operations.
 *
 * @Andre Arante
9.14.21
 */
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        // prompt and take input for name
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome what is your name?");
        String name = input.nextLine();

        // call method that greets user by name and print instructions
        String hello = greeting(name);
        System.out.println(hello);
        

        // take input for four digit number
        String question = inputPrompt();
        System.out.println(question);
        int num = input.nextInt();

        // call method and print sum of digits
        int sumOfDigits = sum(num);
        System.out.println("Sum of digits: " + sumOfDigits);

        // call method and print reversed digits
        reverse(num);
        
    }

    /**
     * Prints a greeting and instructions.
     *
     * @param name the name of the user
     */
    // method heading
        // greet user
        public static String greeting (String username) {
            username = "Hello, " + username;
            return username;
        }

        // prompt user to input a four-digit number
        public static String inputPrompt () {
            String input = "Enter an integer between 1000 and 9999: ";
            return input;
        }
    /**
     * Calculates the sum of the digits.
     *
     * @param num the number to analyze
     * @return sum of the digits in num as an int
     */
    // method heading
        public static int sum (int num) {
            int ones = num % 10; //7
            int tens = num / 10; 
            tens = tens % 10; //6
            int hundreds = num / 100;
            hundreds = hundreds % 10; //9
            int thousands = num / 1000; //1
            num = ones + tens + hundreds + thousands;
            return num;
        }
        // your implementation
        

    /**
     * Reverses the digits.
     *
     * @param num the number to analyze
     * @return the num with the digits reversed as an int
     */
    // method heading
        public static void reverse (int num) {
            int ones = num % 10; //7
            int tens = num / 10; 
            tens = tens % 10; //6
            int hundreds = num / 100;
            hundreds = hundreds % 10; //9
            int thousands = num / 1000; //1
            System.out.print("Reverse of digits: ");
            System.out.print(ones);
            System.out.print(tens);
            System.out.print(hundreds);
            System.out.print(thousands);
        }

        // your implementation
    
}