package com.josamtechie.java17_sealed_class;

sealed class Vehicle permits Car, Bike
{
    public void registration()
    {
        System.out.println("Vehicle is registered successfully!!");
    }
}

final class Car extends Vehicle
{
// Only allowed because it's listed in `permits`
}

non-sealed class Bike extends Vehicle
{
// This class allows further subclassing
}

class Truck extends Bike
{

}

// Not allowed: class Bus extends Vehicle {}  // Compilation error
// class Bus extends Vehicle{}

public class SealedClassDemo
{
    public static void main(String[] args)
    {
        Car c = new Car();
        c.registration();

        Bike b = new Bike();
        b.registration();

        Truck t = new Truck();
        t.registration();
    }
}
