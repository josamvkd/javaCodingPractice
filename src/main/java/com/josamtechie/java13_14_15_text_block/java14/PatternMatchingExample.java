package com.josamtechie.java13_14_15_text_block.java14;

public class PatternMatchingExample
{
    public static void main(String[] args)
    {
        Object obj = "Hello World";
        if (obj instanceof String s) {
            System.out.println(s.toUpperCase());
        }
    }
}
