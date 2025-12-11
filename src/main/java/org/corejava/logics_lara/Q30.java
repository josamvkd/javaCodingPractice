package org.corejava.logics_lara;
// Read Indexes of Last 3rd Odd Number and First Even Number from an Array with 10 Elements
public class Q30 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 2, 4, 6, 8, 9, 11};

        // Part 1: Last 3rd odd number
        int oddCount = 0;
        boolean oddFound = false;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                oddCount++;
                if (oddCount == 3) {
                    System.out.println("Index of last 3rd odd number: " + i);
                    oddFound = true;
                    break;
                }
            }
        }

        if (!oddFound) {
            System.out.println("Less than 3 odd numbers found");
        }

        // Part 2: First even number
        boolean evenFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Index of first even number: " + i);
                evenFound = true;
                break;
            }
        }

        if (!evenFound) {
            System.out.println("No even number found");
        }
    }
}
