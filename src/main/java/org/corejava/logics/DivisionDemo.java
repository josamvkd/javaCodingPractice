package org.corejava.logics;

public class DivisionDemo
{
    static void main()
    {
        int number = 12345;

        int firstFourDigit = number/10;
        int firstThreeDigit = number/100;
        int firstTwoDigit = number/1000;
        int firstDigit = number/10000;

        System.out.println("*******");
        System.out.println("Original : "+number);
        System.out.println("First Four Digits : "+firstFourDigit);
        System.out.println("First Three Digits : "+firstThreeDigit);
        System.out.println("First Two Digits : "+firstTwoDigit);
        System.out.println("First Digit : "+firstDigit);
    }
}
