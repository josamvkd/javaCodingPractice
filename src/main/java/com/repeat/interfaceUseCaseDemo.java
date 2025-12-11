package com.repeat;

interface DevComputer
{
    void code();
}

class DevLaptop implements DevComputer
{
    public void code()
    {
        System.out.println("In Laptop");
    }
}
class DevDesktop implements DevComputer
{
    public void code()
    {
        System.out.println("In Desktop");
    }
}
class Developer
{
    public void devCode(DevComputer comp){
        comp.code();
    }
}

public class interfaceUseCaseDemo
{
    static void main()
    {

        DevComputer devLap = new DevLaptop();
        DevComputer devDesk = new DevDesktop();
        Developer obj = new Developer();
        //obj.devCode(devLap);
        obj.devCode(devDesk);

    }
}
