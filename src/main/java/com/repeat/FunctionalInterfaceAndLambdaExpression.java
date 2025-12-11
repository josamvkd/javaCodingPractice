package com.repeat;

@FunctionalInterface
interface FirstFunctional
{
    void show();
}


public class FunctionalInterfaceAndLambdaExpression
{
    static void main()
    {
        FirstFunctional obj = () -> System.out.println("In show");
        obj.show();
    }
}
