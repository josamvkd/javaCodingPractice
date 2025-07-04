package org.josamtechie.corejava.exception;

public class ThrowsDemo
{
    public static void main(String[] args)
    {
        try {
            div(8, 1 );
        } catch (ArithmeticException e) {
            System.out.println("Exception Occurred " + e);
        }
    }

    public static void div(int i, int j) throws ArithmeticException
    {
        int result = i / j;
        System.out.println(result);
    }
}
