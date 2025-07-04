package org.josamtechie.corejava.singleton;

// Lazy Singleton class
public class SingletonLazy
{
    // Step 1: Create a private static variable to hold the single instance
    private static SingletonLazy obj;

    // Step 2: Make the constructor private to prevent instantiation
    private SingletonLazy()
    {
        System.out.println("Singleton instance created");
    }

    // Step 3: Provide a public static method to get the instance
    public static SingletonLazy getInstance()
    {
        if (obj == null) {
            obj = new SingletonLazy(); // only created when needed
        }
        return obj;
    }

    // Example method to demonstrate functionality
    public void showMessage()
    {
        System.out.println("Hello from Singleton!");

    }

    public static void main(String[] args)
    {

        SingletonLazy instance1 = SingletonLazy.getInstance();
        instance1.showMessage();

        SingletonLazy instance2 = SingletonLazy.getInstance();

        System.out.println("Are both instances the same? " + (instance1 == instance2));

    }
}
