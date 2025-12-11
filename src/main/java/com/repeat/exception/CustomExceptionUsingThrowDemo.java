package com.repeat.exception;

class NewException extends Exception
{
    public NewException(String message)
    {
        super(message);
    }
}

public class CustomExceptionUsingThrowDemo
{
    static void main()
    {
        int i = 11;
        int j = 10;

        try {
            int result = j / i;
            if (i > j) {
                throw new NewException("value of i should be less than the value of j");
            }
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divided by zero" + e);
        } catch (NewException e) {
            System.out.println("Wrong value of i " + e);
        }
    }
}
