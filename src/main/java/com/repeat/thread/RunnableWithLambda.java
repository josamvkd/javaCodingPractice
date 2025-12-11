package com.repeat.thread;

public class RunnableWithLambda
{
    static void main()
    {

        Runnable obj1 = () ->
        {
            for (int i = 1; i < 10; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Runnable obj2 = () ->
        {
            for (int i = 1; i < 10; i++) {
                System.out.println("Hello");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        t1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();

    }
}
