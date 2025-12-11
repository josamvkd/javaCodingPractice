package org.corejava.logics_lara;

public class Q16
{
    public static void main(String[] args)
    {
        // Read Last Odd Element from an Array
        int[] arr = {2, 4, 6, 8, 10, 11, 12, 13, 14, 15};
        boolean found = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.println("Last odd element: " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No odd element found");
        }
    }
}
