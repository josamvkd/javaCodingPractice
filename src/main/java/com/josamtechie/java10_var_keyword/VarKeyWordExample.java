package com.josamtechie.java10_var_keyword;

import java.util.ArrayList;
import java.util.Scanner;

public class VarKeyWordExample
{
    public static void main(String[] args)
    {
        var sc = new Scanner(System.in);
        var array = new ArrayList<>();
        for (var i = 1; i <= 3; i++) {
            array.add(sc.nextLine());
        }
        System.out.println(array);
    }
}
