package com.repeat;

class Vehicle{
    String type;
    String color;
    static String manufacturesName;

    static {
        manufacturesName ="Toyota";
    }

    public void details(){
        System.out.println(type+" : "+color+" : "+manufacturesName);
    }
}

public class StaticBlockDemo
{
    static void main(String[] args)
    {
        Vehicle v1 = new Vehicle();
        v1.type ="Sedan";
        v1.color="White";
        Vehicle v2 = new Vehicle();
        v2.type ="SUV";
        v2.color="Red";

        v1.details();
        v2.details();
    }
}
