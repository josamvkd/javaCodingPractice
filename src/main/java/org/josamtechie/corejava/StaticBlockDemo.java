package org.josamtechie.corejava;

class Car {

    String brand;
    int price;
    static String model;

    static {
        model = "SUV";
        System.out.println("Inside static block");
    }

    public Car() {
        System.out.println("Inside Constructor");
    }

    public void show() {
        System.out.println(brand + " : " + price + " : " + model);
    }
}
public class StaticBlockDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        Car obj1 = new Car();
        obj1.brand = "Toyota";
        obj1.price = 48000;
        Car obj2 = new Car();
        obj2.brand = "KIA";
        obj2.price = 38000;

        obj1.show();
        obj2.show();

        //Class.forName("Car");
    }
}
