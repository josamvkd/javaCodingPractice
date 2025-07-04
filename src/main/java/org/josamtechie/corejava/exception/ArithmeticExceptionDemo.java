package org.josamtechie.corejava.exception;

public class ArithmeticExceptionDemo
{
    public static void main(String[] args)
    {
        int i = 8;
        int j = 0;
        int result=0;
        try {
            result = i / j;
        } catch (Exception e) {
            System.out.println("Exception :!!! " + e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
