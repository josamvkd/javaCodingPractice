package org.corejava.starpatterns;

import java.util.Scanner;

public class InvertedRightAlignedTriangle
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            System.out.print(" ".repeat(n - row));
            System.out.println("*".repeat(row));
        }
    }
}
