package com.repeat;

class TwoWheeler
{
    public void show1()
    {
        System.out.println(" In TwoWheeler show");
    }
}
class Bike extends TwoWheeler
{
    public void show2()
    {
        System.out.println(" In Bike show");
    }
}


public class UpCastingDownCastingDemo
{
    static void main()
    {
        // Upcasting
        TwoWheeler obj = new Bike();
        obj.show1();

        // DownCasting
        Bike obj1 = (Bike) obj;
        obj1.show2();
    }
}
