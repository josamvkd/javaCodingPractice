package org.josamtechie.corejava.starpatterns;

public class ButterflyPattern
{
    public static void main(String[] args)
    {
        int n = 5;
        // Upper half
        for (int i = 1; i <= n; i++) {
            String stars = "*".repeat(i);
            String spaces = " ".repeat(2 * (n - i));
            System.out.println(stars + spaces + stars);
        }
        // Lower half
        for (int i = n - 1; i >= 1; i--) {
            String stars = "*".repeat(i);
            String spaces = " ".repeat(2 * (n - i));
            System.out.println(stars + spaces + stars);
        }
    }

}
