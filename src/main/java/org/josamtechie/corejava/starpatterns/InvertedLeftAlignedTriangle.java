package org.josamtechie.corejava.starpatterns;

public class InvertedLeftAlignedTriangle
{
    public static void main(String[] args)
    {
        int n = 5;
        for (int row = n; row >= 1; row--) {
            System.out.println("* ".repeat(row));
        }
    }
}
