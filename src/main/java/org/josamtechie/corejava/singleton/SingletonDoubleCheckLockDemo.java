package org.josamtechie.corejava.singleton;

class SingletonDoubleCheckLock
{

    // Volatile ensures visibility and ordering
    private static volatile SingletonDoubleCheckLock obj;

    private SingletonDoubleCheckLock()
    {
        System.out.println("Singleton instance created");
    }

    public static SingletonDoubleCheckLock getInstance()
    {
        if (obj == null) {
            synchronized (SingletonDoubleCheckLock.class) {
                if (obj == null)
                    obj = new SingletonDoubleCheckLock();
            }
        }
        return obj;
    }

    public void showMessage()
    {
        System.out.println("Hello from Singleton!");
    }
}

public class SingletonDoubleCheckLockDemo
{
    public static void main(String[] args)
    {
        Runnable task = () -> {
            SingletonDoubleCheckLock instance = SingletonDoubleCheckLock.getInstance();
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
}
