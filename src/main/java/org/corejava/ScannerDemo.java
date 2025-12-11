package org.corejava;

import java.util.Scanner;

public class ScannerDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextInt());
        sc.close();
    }
}
