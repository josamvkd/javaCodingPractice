package com.repeat;

class Laptop
{
    String model;
    int price;

    public String toString()
    {
        return model + " : " + price;
    }
}

public class ObjectClassDemo
{
    static void main()
    {
        Laptop obj = new Laptop();
        obj.model = "Macbook M2 Pro";
        obj.price = 5000;
        //System.out.println(obj); // o/p : Laptop@8efb846
        //System.out.println(obj.toString()); // o/p : Laptop@8efb846
//        public String toString () {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode());
//        }
        // Now add the toString method in the laptop class
        System.out.println(obj);
    }
}
