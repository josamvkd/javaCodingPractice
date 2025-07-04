package org.josamtechie.corejava.logics_lara;

public class Q12
{
    public static void main(String[] args)
    {
    // Read First 5 Elements and Last 2 Elements from an Array
        int[] arr = {11, 22, 33, 44, 55, 66, 77, 88, 99, 100};
        System.out.print("First 5 elements: ");
        for (int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nLast 2 elements: ");
        for (int i=arr.length-2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
