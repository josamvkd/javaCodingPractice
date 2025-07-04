package org.josamtechie.corejava.singleton;

class SingletonSynchronized
{
    private static SingletonSynchronized obj;

    private SingletonSynchronized()
    {
        System.out.println("Singleton instance created");
    }

    public static synchronized SingletonSynchronized getInstance()
    {
        if (obj == null) {
            obj = new SingletonSynchronized();
        }
        return obj;
    }

    public void showMessage()
    {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonSynchronizedDemo
{
    public static void main(String[] args)
    {
        Runnable task = () ->
        {
            SingletonSynchronized instance = SingletonSynchronized.getInstance();
            instance.showMessage();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        Thread t4 = new Thread(task);
        Thread t5 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }

    ;
}
