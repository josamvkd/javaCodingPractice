package org.corejava.thread;

class A extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class B extends Thread
{
    public void run()
    {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}

public class ThreadDemo
{
    public static void main(String[] args)
    {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        obj2.start();
    }
}
