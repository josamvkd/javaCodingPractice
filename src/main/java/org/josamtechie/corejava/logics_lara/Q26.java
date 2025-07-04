package org.josamtechie.corejava.logics_lara;

public class Q26 {
    public static void main(String[] args) {
        // Read Index of Last Even Number from an Array with 10 Elements
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 11};

        // Loop in reverse to find last even number
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                System.out.println("Index of last even number: " + i);
                return;
            }
        }

        // If no even number found
        System.out.println("No even number found");
    }
}
