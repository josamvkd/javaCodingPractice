package org.josamtechie.corejava.thread;

class ClassOne implements Runnable
{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class ClassTwo implements Runnable
{
    public void run(){
        for (int i=0;i<5;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

public class RunnableDemo
{
    public static void main(String[] args)
    {
        Runnable obj1 = new ClassOne();
        Runnable obj2 = new ClassTwo();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}
