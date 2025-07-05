package org.josamtechie.corejava.algorithms;

public class LinearSearchExample {
    public static void main(String[] args) {
        int[] a = {15, 5, 20, 35, 2, 42, 67, 17};
        int target = 42;
        boolean found = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                System.out.println("Element " + target + " found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
