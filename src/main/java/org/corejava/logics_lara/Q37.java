package org.corejava.logics_lara;

// Read 2nd Half of an Even-Length Array in Reverse Order
public class Q37
{
    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        int n = arr.length;
        if (n % 2 == 0) {
            System.out.println("Second half elements in reverse order:");
            for (int i = n - 1; i >= n / 2; i--) {
                System.out.print(arr[i] + " ");
            }
        } else {
            System.out.println("Array does not have even number of elements.");
        }
    }
}


