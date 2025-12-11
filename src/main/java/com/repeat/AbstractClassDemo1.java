package com.repeat;

// Rule No 1 We cant create an object for Abstract Class
// Rule No 2 If a method is abstract then the class must be abstract class
// Rule No 3 We can use the Object reference of abstract class for object creation
// Rule No 4 Abstract class can have both Abstract method/normal method or both
abstract class Bus // Abstract Class
{
    public abstract void drive();
    public void playMusic(){
        System.out.println("Music playing....");
    }
}
class TouristBus extends Bus { // Concrete class

    public void drive()
    {
        System.out.println("Driving bus....");
    }
}

public class AbstractClassDemo1
{
    static void main()
    {

        //Bus obj = new Bus();
        Bus obj = new TouristBus();
        //TouristBus obj = new TouristBus();
        obj.drive();
        obj.playMusic();

    }
}
