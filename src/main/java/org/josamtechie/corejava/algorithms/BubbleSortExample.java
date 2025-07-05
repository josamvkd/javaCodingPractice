package org.josamtechie.corejava.algorithms;

public class BubbleSortExample
{
    public static void main(String[] args)
    {
        int[] arr = {15, 16, 6, 8, 5};

        // Print the sorted array
        System.out.print("Un Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Bubble Sort Algorithm
        for (int i = 0; i < arr.length - 1; i++) {
            int flag = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                break;
            }
        }

        // Print the sorted array
        System.out.print("\nSorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
