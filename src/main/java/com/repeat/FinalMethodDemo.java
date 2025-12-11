package com.repeat;

class Shop
{
    public final void show()
    {
        System.out.println("In Shop Show");
    }
    public void purchase()
    {
        System.out.println("In Shop Purchase");
    }
}
class Seller extends Shop
{
    // Cannot override the method show since this method is final in the parent class
//    public void show()
//    {
//        System.out.println("In Seller show");
//    }
}

public class FinalMethodDemo
{
    static void main()
    {
        Shop obj = new Shop();
        obj.show();
        obj.purchase();

//        Seller obj1 = new Seller();
//        obj1.show();
    }
}
