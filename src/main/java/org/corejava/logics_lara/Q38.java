package org.corejava.logics_lara;

// Read 1st Half of an Even-Length Array in Reverse Order and Pick Alternate Elements
public class Q38 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        int n = arr.length;

        if (n % 2 == 0) {
            System.out.println("Alternate elements from 1st half in reverse order:");
            for (int i = (n / 2) - 1; i >= 0; i -= 2) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Array does not have even number of elements.");
        }
    }
}
