package org.josamtechie.corejava.exception;

public class ThrowDemo
{
    public static void main(String[] args)
    {
        ageCheck(10);
    }

    public static void ageCheck(int age)
    {
        try {
            if (age < 18) {
                throw new IllegalArgumentException("Age should be greater than 18");
            } else {
                System.out.println("User permission granted!!");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception Occurred!! " + e);
        }

    }
}
