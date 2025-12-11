package org.corejava.logics_lara;

public class Q29 {
    public static void main(String[] args) {
        // Read Index of Last 3rd Odd Number from an Array with 10 Elements
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8, 9, 11};

        int count = 0;

        // Traverse from end to find 3rd last odd number
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == 3) {
                    System.out.println("Index of last 3rd odd number: " + i);
                    return;
                }
            }
        }

        // If fewer than 3 odd numbers
        System.out.println("Less than 3 odd numbers found");
    }
}
