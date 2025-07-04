package org.josamtechie.corejava.singleton;

public class SingletonBillPugh
{
    private SingletonBillPugh()
    {
        System.out.println("Singleton instance created");
    }

    private static class SingletonHelper
    {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance()
    {
        return SingletonHelper.INSTANCE;
    }

    public void showMessage()
    {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args)
    {
        SingletonBillPugh instance1 = SingletonBillPugh.getInstance();
        SingletonBillPugh instance2 = SingletonBillPugh.getInstance();
        instance1.showMessage();

        System.out.println("Are both instances same? " + (instance1 == instance2));

    }
}

