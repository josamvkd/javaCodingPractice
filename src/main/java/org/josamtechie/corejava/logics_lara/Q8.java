package org.josamtechie.corejava.logics_lara;

public class Q8
{
    public static void main(String[] args)
    {
        // Read Last 4 Elements from a 17-Element Array
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
        for (int i = numbers.length - 4; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
