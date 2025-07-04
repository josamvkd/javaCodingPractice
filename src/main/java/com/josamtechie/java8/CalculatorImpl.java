package com.josamtechie.java8;

@FunctionalInterface
interface Calculator {
    //void switchOn();

    //void switchOn(int sum);

    int substraction(int i, int j);
}

public class CalculatorImpl{

    public static void main(String[] args) {
//        Calculator calculator =  () -> {
//            System.out.println("Switched On");
//        };

        //Calculator calculator =  () -> System.out.println("Switched On");

        //calculator.switchOn();

        //Calculator calculator = (result) -> System.out.println("Sum : "+result);

        //calculator.switchOn(100);

        Calculator calculator = (i, j)-> {
            if(i<j){
                throw new ArithmeticException("Substraction not possible");
            }else {
                return i - j ;
            }
        };
        System.out.println(calculator.substraction(4,6));
    }
}
