package com.repeat.thread;

class CounterClass
{
    int count;

    public synchronized void increment()
    {
        count++;
    }
}

public class SynchronizedInThread
{

    static void main() throws InterruptedException
    {
        CounterClass counter = new CounterClass();
        Runnable obj1 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        Runnable obj2 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        Runnable obj3 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        Runnable obj4 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        Runnable obj5 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };
        Runnable obj6 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };
        Runnable obj7 = () ->
        {
            for (int i = 1; i <= 10000; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);
        Thread t3 = new Thread(obj3);
        Thread t4 = new Thread(obj4);
        Thread t5 = new Thread(obj5);
        Thread t6 = new Thread(obj5);
        Thread t7 = new Thread(obj5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();

        System.out.println("Total Count : "+counter.count);
    }
}
