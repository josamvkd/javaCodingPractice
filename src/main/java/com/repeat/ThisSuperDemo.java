package com.repeat;

// super() execute the constructor of Super class
// this() execute the constructor of Same class
class A
{
    public A()
    {
        System.out.println("In A");
    }
    public A(int x)
    {
        super();
        System.out.println("In A int");
    }
}

class B extends A
{
    public B()
    {
        super();
        System.out.println("In B");
    }
    public B(int x)
    {
        //super(x);
        this();
        System.out.println("In B int");
    }
}

public class ThisSuperDemo
{
    static void main()
    {
//        B obj = new B();
        B obj = new B(5);
    }
}
