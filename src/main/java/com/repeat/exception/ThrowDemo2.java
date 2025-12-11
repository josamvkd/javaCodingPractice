package com.repeat.exception;

public class ThrowDemo2
{
    static void main()
    {
        ageCheck(18);
    }

    private static void ageCheck(int age)
    {
        if (age < 18) {
            throw new IllegalArgumentException("Age should be greater than 18");
        } else {
            System.out.println("Age verification completed please proceed..!");
        }
    }
}
