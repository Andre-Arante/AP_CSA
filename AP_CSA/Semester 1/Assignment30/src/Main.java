/**
 * A30
 *
 * @author
 * @version
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many values do you have? ");
        int n = in.nextInt();

        // create an array of ints with the identifier "values" ( or get user input).
        int[] values = new int[n];

        for (int i = 0; i < values.length; i++) {
            System.out.print("Enter value: ");
            values[i] = in.nextInt();
        }

        // call maxVal method and print result
        System.out.println("The largest number you entered was " + maxVal(values));
    }

    /**
     * maxVal
     *
     * @param nums - array of ints
     * @return largest int value
     */
    public static int maxVal(int[] nums) {
        int maxVal = nums[0];
        for (int num : nums) {
            if (num > maxVal) maxVal = num;
        }
        return maxVal;
    }
}

