package org.corejava.logics;

public class ModulusDemo
{
    public static void main(String[] args)
    {
        int number = 12345;

        int lastDigit = number % 10;
        int secondLastDigit = number % 100;
        int thirdLastDigit = number % 1000;
        int fourthLastDigit = number % 10000;

        System.out.println("Last Digit : "+lastDigit);
        System.out.println("Last Two Digits : "+secondLastDigit);
        System.out.println("Last Three Digits : "+thirdLastDigit);
        System.out.println("Last Four Digits : "+fourthLastDigit);
        System.out.println("Original : "+number);



    }
}
