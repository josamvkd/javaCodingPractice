package org.josamtechie.corejava.collection.comparator;

public class NumberComparator {

    // Method to compare two integers
    public static int compare(int a, int b) {
        if (a > b) {
            return 1;   // a is greater than b
        } else if (a < b) {
            return -1;  // a is less than b
        } else {
            return 0;   // a and b are equal
        }
    }

    public static void main(String[] args) {
        int result1 = compare(10, 5);   // Should return 1
        int result2 = compare(5, 10);   // Should return -1
        int result3 = compare(7, 7);    // Should return 0

        // Print results
        System.out.println("compare(10, 5): " + result1);
        System.out.println("compare(5, 10): " + result2);
        System.out.println("compare(7, 7): " + result3);
    }
}

