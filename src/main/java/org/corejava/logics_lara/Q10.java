package org.corejava.logics_lara;

public class Q10
{
    public static void main(String[] args)
    {
        // Read First 2 Elements and Last 2 Elements from a 10-Element Array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        // First 2 elements
        int first1 = numbers[0];
        int first2 = numbers[1];

        // Last 2 elements
        int last1 = numbers[numbers.length - 1];
        int last2 = numbers[numbers.length - 2];
        System.out.println("First two elements: " + first1 + " " + first2);
        System.out.println("Last two elements: " + last1 + " " + last2);
    }
}
