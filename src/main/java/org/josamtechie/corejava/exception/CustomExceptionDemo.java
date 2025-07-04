package org.josamtechie.corejava.exception;

class BalanceException extends RuntimeException
{
    public BalanceException(String message)
    {
        super(message);
    }
}

public class CustomExceptionDemo
{
    public static void main(String[] args)
    {
        checkbalance(900);
    }
    public static void checkbalance(int balance)
    {
        try {
            if (balance < 1000) {
                throw new BalanceException("Your minimum balance should be 1000");
            } else {
                System.out.println("You have sufficient balance please proceed!!");
            }
        } catch (BalanceException e) {
            System.out.println("Exception Occurred : " + e);
        }

    }
}
