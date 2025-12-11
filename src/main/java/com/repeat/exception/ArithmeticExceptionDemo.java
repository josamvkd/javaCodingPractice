package com.repeat.exception;

public class ArithmeticExceptionDemo
{
    static void main()
    {
        int i = 0;
        int j = 9;
        try {
            int result = j / i;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred");
        }
        System.out.println("Execution Completed!");
    }
}
