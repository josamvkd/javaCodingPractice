package com.repeat.thread;

class ThreadOne implements Runnable
{
    public void run()
    {
        for(int i =1; i<10;i++)
        {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
}

class ThreadTwo implements Runnable
{
    public void run()
    {
        for(int i =1; i<10;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
}

public class RunnableDemo
{
    static void main()
    {
        ThreadOne obj1 = new ThreadOne();
        ThreadTwo obj2 = new ThreadTwo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        t2.start();

    }
}
