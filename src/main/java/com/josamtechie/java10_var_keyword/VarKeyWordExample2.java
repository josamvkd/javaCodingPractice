package com.josamtechie.java10_var_keyword;

import java.util.Arrays;

public class VarKeyWordExample2
{
    public static void main(String[] args)
    {
        var num = 10;
        var name = "Test";
        var amount = 25.6;
        System.out.println(num);
        System.out.println(name);
        System.out.println(amount);

        var list = Arrays.asList(4, 2, 6, 3, 7);
        System.out.println("--List---");
        list.forEach(System.out::println);
    }
}
