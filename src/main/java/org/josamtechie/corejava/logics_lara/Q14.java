package org.josamtechie.corejava.logics_lara;

public class Q14
{
    public static void main(String[] args)
    {
        // Read Last Even Element from an Array
        int[] arr = {11, 15, 21, 18, 27, 33, 40, 51, 63, 72};
        boolean found = false;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.println("Last even element: " + arr[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No even element found");
        }
    }
}
