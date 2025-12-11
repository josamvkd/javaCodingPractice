package org.corejava.logics_lara;

public class Q34
{
    public static void main(String[] args)
    {
        // Read Alternative Elements from an Array in Reverse Order Starting from Last Element
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Alternate elements in reverse order:");
        for (int i=arr.length-1 ; i>=0; i-=2){
            System.out.print(arr[i]+" ");
        }
    }
}
