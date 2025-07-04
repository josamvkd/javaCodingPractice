package org.josamtechie.corejava.singleton;

// Eager Singleton class
public class SingletonEager
{
    // Step 1: Create the instance at the time of class loading
    private static final SingletonEager obj = new SingletonEager();

    // Step 2: Private constructor to prevent instantiation
    private SingletonEager()
    {
        System.out.println("EagerSingleton instance created.");
    }

    // Step 3: Public method to provide access to the instance
    public static SingletonEager getInstance()
    {
        return obj;
    }

    // Example method
    public void show()
    {
        System.out.println("Hello from Singleton Eager!!!");
    }

    // Main method to test the singleton
    public static void main(String[] args)
    {
        SingletonEager instance1 = SingletonEager.getInstance();
        instance1.show();

        SingletonEager instance2 = SingletonEager.getInstance();
        System.out.println("Are both instances the same? " + (instance1 == instance2));


    }

}
