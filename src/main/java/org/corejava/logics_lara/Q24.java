package org.corejava.logics_lara;

public class Q24 {
    public static void main(String[] args) {
        // Read Index of 2nd Even Number from an Array with 10 Elements
        int[] arr = {1, 4, 7, 8, 10, 11, 13, 15, 17, 19};

        int evenCount = 0;

        // Loop through the array to find index of 2nd even number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
                if (evenCount == 2) {
                    System.out.println("Index of 2nd even number: " + i);
                    return;
                }
            }
        }

        // If fewer than 2 even numbers
        System.out.println("Less than 2 even numbers found");
    }
}
