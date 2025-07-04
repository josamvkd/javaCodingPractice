package org.josamtechie.corejava.logics_lara;

public class Q15
{
    public static void main(String[] args)
    {
        // Read First Odd Element from an Array with 10 Elements
        int[] arr = {2, 4, 6, 7, 8, 10, 11, 13, 15, 17};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("First odd element: " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No odd element found");
        }
    }
}
