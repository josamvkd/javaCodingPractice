package org.josamtechie.corejava.logics_lara;

public class Q22 {
    public static void main(String[] args) {
        // Read Index of First Even Number from an Array with 10 Elements
        int[] arr = {3, 5, 7, 8, 9, 11, 13, 15, 17, 19};

        boolean found = false;

        // Loop to find index of first even number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Index of first even number: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No even number found");
        }
    }
}
