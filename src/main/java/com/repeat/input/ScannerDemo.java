package com.repeat.input;

import java.util.Scanner;

public class ScannerDemo
{
    static void main()
    {
        System.out.println("Enter :");
        Scanner sc =new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(input);
    }
}
