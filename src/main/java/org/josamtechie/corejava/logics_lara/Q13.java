package org.josamtechie.corejava.logics_lara;

public class Q13
{
    public static void main(String[] args)
    {
        // Read First Even Element from an Array
        int[] arr = {11, 15, 21, 18, 27, 33, 40, 50, 60, 70};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("First even element: " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No even element found");
        }
    }
}
