package org.josamtechie.corejava.logics_lara;

// Read All Even Elements from an Array with 10 Elements
public class Q31
{
    public static void main(String[] args)
    {
        int[] arr = {4, 7, 2, 9, 10, 3, 8, 5, 6, 1};

        System.out.println("Even elements are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
