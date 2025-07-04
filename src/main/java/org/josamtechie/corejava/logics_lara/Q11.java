package org.josamtechie.corejava.logics_lara;

public class Q11
{
    public static void main(String[] args)
    {
    // Read First 2 Elements and Last 5 Elements from an Array
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.print("First 2 elements: ");
        for(int i=0;i<2;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nLast 5 elements: ");
        for (int i=arr.length-5;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
