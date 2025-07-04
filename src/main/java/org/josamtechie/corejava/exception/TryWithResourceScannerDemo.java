package org.josamtechie.corejava.exception;

import java.util.Scanner;

public class TryWithResourceScannerDemo
{
    public static void main(String[] args)
    {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the number : ");
            System.out.println(sc.nextInt());
        }
    }
}
