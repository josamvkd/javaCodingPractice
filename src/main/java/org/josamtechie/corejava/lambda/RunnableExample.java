package org.josamtechie.corejava.lambda;

public class RunnableExample
{
    public static void main(String[] args)
    {
        Runnable r = () -> {
            System.out.println("Hello, Lambda!");
        };
        new Thread(r).start();
    }
}
