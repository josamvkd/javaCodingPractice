package com.repeat;

class Phone{
    String brandName;
    String color;
    static String model;
    static {
        model="Smartphone";
    }

    public void details(){
        System.out.println("*******In Normal Block*********");
        System.out.println(brandName+" : "+color+" : "+model);
    }
    public static void details2(Phone obj){
        System.out.println("*******In static Method*********");
        System.out.println(obj.brandName+" : "+obj.color+" : "+model);
    }
}

public class StaticMethodDemo
{
    static void main(String[] args)
    {
        Phone phone1 = new Phone();
        phone1.brandName="Apple";
        phone1.color="White";
        Phone phone2 = new Phone();
        phone2.brandName="Nokia";
        phone2.color="Black";

        phone1.details();
        phone2.details();
        Phone.details2(phone1);

    }
}
