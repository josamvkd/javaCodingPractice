package org.corejava.logics_lara;

// Read Alternative Elements from an Array Starting from 2nd Element
public class Q35 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.println("Alternate elements starting from second element:");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
