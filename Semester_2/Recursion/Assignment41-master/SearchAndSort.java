/**
 * Example of Insertion Sort and Binary Search.
 *
 * @author Mr. King
 * @version April 2021
 */

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        int[] list = {1, -10, 2, 3, 1, -1, 9, 8, 11};
        System.out.println("Original array: " + Arrays.toString(list));
        sortContacts(list);
        System.out.println("Sorted array: " + Arrays.toString(list));
        System.out.println("1 is at index " + getContact(list, 1));
        System.out.println("-10 is at index " + getContact(list, -10));
        System.out.println("9 is at index " + getContact(list, 9));
        System.out.println("668 is at index " + getContact(list, 668));
    }
    
    

    /**
     * @param list - the array of ints to be sorted with insertion sort.
     */
    public static void sortContacts(int[] list)
    {
        int temp = 0;

        for (int i = 1; i < list.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(list[j] < list[j-1])
                {
                    temp = list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }
            }
        }
    }

    /**
     * @param list - the array of ints to look in.
     * @param val - the value to be found in the array.
     * @return the index where val is in the array, -1 if not found.
     */
    public static int getContact(int[] list, int val)
    {
        int start = 0;
        int end = list.length - 1;

        while (start <= end)
        {
            int mid = (start + end) / 2;
            if (val == list[mid])
            {
                return mid;
            }

            if (val < list[mid])
            {
                end = mid - 1;
            }

            else
            {
                start = mid + 1;
            }
        }

        return -1;
    }
}
