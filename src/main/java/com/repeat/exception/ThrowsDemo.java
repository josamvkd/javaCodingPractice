package com.repeat.exception;
class ThrowsTest{

    public void show() throws ClassNotFoundException
    {
     Class.forName("ArithmeticExceptionDemo");
    }
}

public class ThrowsDemo
{
    static {
        System.out.println("Class Loaded");
    }
    static void main()
    {
        ThrowsTest obj = new ThrowsTest();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            e.getStackTrace();
        }
    }
}
