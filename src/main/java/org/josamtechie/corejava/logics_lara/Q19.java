package org.josamtechie.corejava.logics_lara;

public class Q19
{
    public static void main(String[] args)
    {
        // Find Total Number of Elements, Odd Elements count, and Even Elements count in an Array
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int totalNoOfElements = arr.length;
        int evenCount=0;
        int oddCount=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        // Display results
        System.out.println("Total elements: " + totalNoOfElements);
        System.out.println("Total odd elements: " + oddCount);
        System.out.println("Total even elements: " + evenCount);
    }
}
