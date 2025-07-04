package org.josamtechie.corejava;

abstract class AAA // abstract class
{
    public abstract void method1();
    public abstract void method2();
    public void method3()
    {
        System.out.println("In method3");
    }
    public void method4()
    {
        System.out.println("In method4");
    }
}
abstract class BBB extends AAA // abstract class
{
    public abstract void method6();
    public void method5()
    {
        System.out.println("In method5");
    }

}

class CCC extends BBB { // concrete class

    @Override
    public void method1()
    {
        System.out.println("In method1");
    }

    @Override
    public void method2()
    {
        System.out.println("In method2");
    }

    @Override
    public void method6()
    {
        System.out.println("In method6");
    }
}


public class AbstractClassDemo
{
    public static void main(String[] args)
    {
        //AAA obj = new AAA(); // AAA is abstract; cannot be instantiated
        //BBB obj = new BBB(); // BBB is abstract; cannot be instantiated
        CCC obj = new CCC();
        obj.method1();
        obj.method2();
        obj.method3();
        obj.method4();
        obj.method5();
        obj.method6();
    }
}
