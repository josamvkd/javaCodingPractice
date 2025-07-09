package com.josamtechie.java11;

public class StringMethodsDemo
{
    public static void main(String[] args)
    {

        String str = "  Hello World  \n Second line  ";
        System.out.println(str.isBlank());         // false
        str.lines().forEach(System.out::println);  // Splits by line
        System.out.println(str.strip());           // "Hello World\n Second line"
        System.out.println("abc".repeat(3));       // "abcabcabc"
    }
}
