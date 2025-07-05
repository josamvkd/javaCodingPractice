package org.josamtechie.corejava.algorithms;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[] a = {5, 9, 17, 23, 25, 45, 59, 63, 71, 89};
        int target = 59;
        int index = binarySearch(a, target);

        if (index != -1) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int begin = 0;
        int end = arr.length - 1;

        while (begin <= end) {
            //int mid = (begin + end ) / 2;
            int mid = begin + (end - begin) / 2;
            if (arr[mid] == target) {
                return mid; // key found
            } else if (arr[mid] < target) {
                begin = mid + 1; // search right half
            } else {
                end = mid - 1; // search left half
            }
        }

        return -1; // key not found
    }
}

