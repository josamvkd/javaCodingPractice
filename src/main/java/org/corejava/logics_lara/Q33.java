package org.corejava.logics_lara;

public class Q33
{
    public static void main(String[] args)
    {
        // Read Alternative Elements from an Array Starting from First Element
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Alternate elements from the array:");
        for (int i=0;i<arr.length;i+=2){
            System.out.print(arr[i]+" ");
        }
    }
}
