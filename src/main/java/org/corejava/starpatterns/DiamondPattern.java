package org.corejava.starpatterns;

public class DiamondPattern
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int row = 1; row <= n; row++) {
            System.out.print(" ".repeat(n - row));
            System.out.println("*".repeat(2 * row - 1));
        }
        for (int row = n; row >= 1; row--) {
            System.out.print(" ".repeat(n - row));
            System.out.println("*".repeat(2 * row - 1));
        }
    }

}
