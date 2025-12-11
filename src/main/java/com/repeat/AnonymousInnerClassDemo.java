package com.repeat;

class Gym
{
    public void show()
    {
        System.out.println(" In Gym Show");
    }
}

public class AnonymousInnerClassDemo
{
    static void main()
    {
//        Gym obj = new Gym();
//        obj.show();
        Gym obj = new Gym()
        {
            public void show()
            {
                System.out.println("In New Show");
            }
        };
        obj.show();
    }
}
