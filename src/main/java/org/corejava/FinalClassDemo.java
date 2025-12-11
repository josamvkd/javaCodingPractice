package org.corejava;

final class Aircraft
{
    public void takeOff(){
        System.out.println("Aircraft take off!!");
    }

    public void landing(){
        System.out.println("Aircraft landed!!");
    }
}

// java: cannot inherit from final Aircraft
//class AirBus extends Aircraft{
//    public void A380(){
//        System.out.println("WideBody AirCraft");
//    }
//}

public class FinalClassDemo
{
    public static void main(String[] args)
    {
        Aircraft obj = new Aircraft();
        obj.takeOff();
        obj.landing();
    }
}
