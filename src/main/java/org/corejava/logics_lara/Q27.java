package org.corejava.logics_lara;

public class Q27 {
    public static void main(String[] args) {
        // Read Index of Last Odd Number from an Array with 10 Elements
        int[] arr = {2, 4, 6, 8, 10, 11, 13, 15, 17, 20};

        // Loop in reverse to find last odd number
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                System.out.println("Index of last odd number: " + i);
                return;
            }
        }

        // If no odd number found
        System.out.println("No odd number found");
    }
}
