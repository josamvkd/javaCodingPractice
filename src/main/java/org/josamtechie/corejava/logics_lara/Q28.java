package org.josamtechie.corejava.logics_lara;

public class Q28 {
    public static void main(String[] args) {
        // Read Index of Last 2nd Even Number from an Array with 10 Elements
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8, 9, 11};

        int count = 0;

        // Traverse array in reverse to find second last even number
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                count++;
                if (count == 2) {
                    System.out.println("Index of last 2nd even number: " + i);
                    return;
                }
            }
        }

        // If fewer than 2 even numbers
        System.out.println("Less than 2 even numbers found");
    }
}
