package org.corejava.logics_lara;

public class Q25 {
    public static void main(String[] args) {
        // Read Index of 3rd Odd Number from an Array with 10 Elements
        int[] arr = {2, 5, 7, 9, 10, 12, 13, 14, 15, 16};

        int oddCount = 0;

        // Loop to find index of 3rd odd number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
                if (oddCount == 3) {
                    System.out.println("Index of 3rd odd number: " + i);
                    return;
                }
            }
        }

        // If fewer than 3 odd numbers found
        System.out.println("Less than 3 odd numbers found");
    }
}
