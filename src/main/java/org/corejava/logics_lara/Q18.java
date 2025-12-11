package org.corejava.logics_lara;

public class Q18
{
    public static void main(String[] args)
    {
        // Read 2nd Even Element from an Array
        int[] arr = {1, 4, 7, 8, 10, 11, 13, 14, 15, 17};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
                if (count == 2) {
                    System.out.println("2rd even element: " + arr[i]);
                }
            }
        }
        // If less than 2 even elements
        System.out.println("Less than 2 even elements found");
    }
}
