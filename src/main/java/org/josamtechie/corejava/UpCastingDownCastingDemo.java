package org.josamtechie.corejava;

class AA
{
    public void show1()
    {
        System.out.println("In AA show1");
    }
}

class BB extends AA
{
    public void show2()
    {
        System.out.println("In BB show2");
    }
}

public class UpCastingDownCastingDemo
{
    public static void main(String[] args)
    {
        // Up-Casting
        // AA obj1 = (AA) new BB(); no need to declare the casting explicitly
        AA obj1 = new BB();
        obj1.show1();
        // Down-Casting
        BB obj2 = (BB) obj1;
        obj2.show2();

    }
}
