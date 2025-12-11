package org.corejava.logics;

interface Printer
{
    default void connect()
    {
        System.out.println("Connecting to Printer..");
    }
}

interface Scanner
{
    default void connect()
    {
        System.out.println("Connecting to Scanner..");
    }

}

class MultifunctionalDevice implements Printer, Scanner
{

    @Override
    public void connect()
    {
        Printer.super.connect();
    }
}

public class InterfaceQuestion
{
    static void main()
    {
        MultifunctionalDevice device = new MultifunctionalDevice();
        device.connect();
    }
}
