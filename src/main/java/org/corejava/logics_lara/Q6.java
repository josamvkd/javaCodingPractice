package org.corejava.logics_lara;

public class Q6
{
    public static void main(String[] args)
    {
    // Read Last Two Elements from a 10-Element Array

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int secondLast = numbers[numbers.length-2];
        int last = numbers[numbers.length-1];
        System.out.println("Second last element: " + secondLast);
        System.out.println("Last element: " + last);

    }
}
