package org.corejava.logics_lara;

public class Q23 {
    public static void main(String[] args) {
        // Read Index of First Odd Number from an Array with 10 Elements
        int[] arr = {2, 4, 6, 7, 8, 10, 12, 14, 16, 18};

        boolean found = false;

        // Loop to find index of first odd number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println("Index of first odd number: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No odd number found");
        }
    }
}
