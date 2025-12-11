package org.corejava.starpatterns;

import java.util.Scanner;

public class SquarePattern
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int row = 0; row < n; row++) {
            System.out.println("* ".repeat(n));
        }
    }
}
