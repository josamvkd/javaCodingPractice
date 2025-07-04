package org.josamtechie.corejava.starpatterns;

import java.util.Scanner;

public class LeftAlignedTriangle
{

    public static void main(String[] args)
    {
        int n = 5;
        for (int row =1;row <=n;row++){
            System.out.println("* ".repeat(row));
        }

    }
}
