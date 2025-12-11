package org.corejava.logics_lara;

public class Q9
{
    public static void main(String[] args)
    {
    // Read First and Last Element from a 10-Element Array
        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int firstElement= numbers[0];
        int lastElement= numbers[numbers.length-1];
        System.out.println("First element: " + firstElement);
        System.out.println("Last element: " + lastElement);
    }
}
