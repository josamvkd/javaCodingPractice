package org.corejava.logics_lara;

// Read Alternative Elements from an Array in Reverse Order Starting from 2nd Last Element
public class Q36 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Alternate elements in reverse order from 2nd last element:");
        for (int i = arr.length - 2; i >= 0; i -= 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
