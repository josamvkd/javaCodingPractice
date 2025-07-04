package com.josamtechie.java19_virtual_thread;

public class VirtualThreadExample
{
    public static void main(String[] args) throws InterruptedException
    {
        Thread vThread = Thread.startVirtualThread(() -> System.out.println("Hello from virtual thread!"));
        vThread.join();
    }
}
