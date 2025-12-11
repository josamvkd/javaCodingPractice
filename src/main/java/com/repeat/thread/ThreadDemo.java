package com.repeat.thread;

class A extends Thread
{
    public void run()
    {
       for(int i=1;i<10;i++)
       {
           System.out.println("Hi");
           try {
               Thread.sleep(10);
           } catch (InterruptedException e) { throw new RuntimeException(e); }
       }
    }
}
class B extends Thread
{
    public void run()
    {
        for(int i=1;i<10;i++)
        {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { throw new RuntimeException(e); }
        }
    }
}


public class ThreadDemo
{
    static void main()
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) { throw new RuntimeException(e); }
        obj2.start();
    }
}
