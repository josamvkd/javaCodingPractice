package org.josamtechie.corejava.logics;

public class ModAndDivisionDemo
{
    public static void main(String[] args)
    {
        int number = 12345;

        int lastDigit = number % 10;
        int secondLastDigit = number % 100;
        int thirdLastDigit = number % 1000;
        int fourthLastDigit = number % 10000;

        System.out.println(lastDigit);
        System.out.println(secondLastDigit);
        System.out.println(thirdLastDigit);
        System.out.println(fourthLastDigit);
        System.out.println(number);

        System.out.println("*******");

        int firstFourDigit = number/10;
        int firstThreeDigit = number/100;
        int firstTwoDigit = number/1000;
        int firstDigit = number/10000;

        System.out.println("*******");
        System.out.println(number);
        System.out.println(firstFourDigit);
        System.out.println(firstThreeDigit);
        System.out.println(firstTwoDigit);
        System.out.println(firstDigit);



    }
}
