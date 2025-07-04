package org.josamtechie.corejava;

class Vehicle {
    public void show() {
        System.out.println("In Vehicle");
    }
}

class Bus extends Vehicle {
    public void show() {
        System.out.println("In Bus");
    }
}

class Truck extends Vehicle {
    public void show() {
        System.out.println("In Truck");
    }
}

// Runtime polymorphism - Dynamic Method Dispatch
public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {

        Vehicle obj = new Vehicle();
        obj.show();

        obj = new Bus();
        obj.show();

        obj = new Truck();
        obj.show();
    }
}
