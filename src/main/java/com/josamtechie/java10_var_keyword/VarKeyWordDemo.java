package com.josamtechie.java10_var_keyword;

import java.util.Scanner;

public class VarKeyWordDemo
{
    public static void main(String[] args)
    {
        System.out.println("Enter your name:");
        var sc = new Scanner(System.in);
        var input = sc.nextLine();
        System.out.println(input);
    }
}
