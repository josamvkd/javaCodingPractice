package org.corejava.logics_lara;

public class Q17
{
    public static void main(String[] args)
    {
        // Read 3rd Odd Element from an Array
        int[] arr = {2, 3, 5, 8, 11, 12, 13, 14, 15, 16};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    System.out.println("3rd odd element: " + arr[i]);
                    return;
                }
            }
        }
        // If less than 3 odd elements
        System.out.println("Less than 3 odd elements found");
    }
}
