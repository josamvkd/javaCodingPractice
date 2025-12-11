package com.repeat.exception;

public class ThrowDemo
{
    static void main()
    {
        int i = 11;
        int j = 10;

        try{
            int result = j/i;
            if(i>j){
                throw new ArithmeticException("value of i should be less than the value of j");
            }
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Cannot divided by zero"+e);
        }
    }
}
