package com.repeat;

class Mobile{
    String name;
    String color;
    static String model;

    public void details(){
        System.out.println(name+" : "+color+" : "+ model);
    }
}



public class StaticVariableDemo
{
    static void main(String[] args)
    {
        Mobile obj1 = new Mobile();
        obj1.name="Samsung";
        obj1.color="Black";
        Mobile.model="Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.name="Apple";
        obj2.color="While";
        Mobile.model="Smart Phone";

        obj1.details();
        obj2.details();
    }
}
