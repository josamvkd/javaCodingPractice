package com.repeat;

// class - class -> extends
// class - interface -> implements
// interface - interface -> extends
interface Fan
{
    void fullSpeed();
}

interface AC
{
    void autoSpeed();
}

interface AirCooler extends AC
{
    void normalSpeed();
}

class CoolingSystem implements Fan,AirCooler
{
    public void fullSpeed()
    {
        System.out.println("In Fan fullSpeed..");
    }
    public void autoSpeed()
    {
        System.out.println("In AC autoSpeed..");
    }
    public void normalSpeed()
    {
        System.out.println("In Cooler normalSpeed..");
    }
}

public class InterfaceDemoMultipleInterface
{
    static void main()
    {
        CoolingSystem obj = new CoolingSystem();
        obj.fullSpeed();
        obj.autoSpeed();
        obj.normalSpeed();
    }
}
