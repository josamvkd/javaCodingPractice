package org.corejava.runandcall;

public class RunnableExample
{
    public static void main(String[] args)
    {
        Runnable task = () -> System.out.println("Runnable task is running..");
        Thread thread = new Thread(task);
        thread.start();
    }
}
