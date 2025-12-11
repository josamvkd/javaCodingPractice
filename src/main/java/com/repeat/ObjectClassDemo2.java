package com.repeat;

import java.util.Objects;

class Computer
{
    String brandName;
    long price;

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Computer computer)) return false;
        return Objects.equals(brandName, computer.brandName) && Objects.equals(price, computer.price);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(brandName, price);
    }

    @Override
    public String toString()
    {
        return "Computer{" +
                "brandName='" + brandName + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ObjectClassDemo2
{
    static void main()
    {
        Computer obj1 = new Computer();
        obj1.brandName="Apple";
        obj1.price= 5000;

        System.out.println(obj1);

        Computer obj2 = new Computer();
        obj2.brandName="Apple";
        obj2.price= 5000;

        System.out.println(obj2);

        System.out.println(obj1.equals(obj2));
    }
}
