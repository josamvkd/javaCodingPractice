package com.repeat;

abstract class Scooter
{
    public abstract void charger();
    public abstract void ride();
}

public class AbstractAndAnonymousInnerClass
{
    static void main()
    {
        Scooter obj = new Scooter()
        {
            public void charger()
            {
                System.out.println("Scooter charging..");
            }

            public void ride()
            {
                System.out.println("Scooter riding..");
            }
        };
        obj.charger();
        obj.ride();
    }
}
