package org.josamtechie.corejava;

class Calculator {
    public int add(int n1, int n2) {
        int r = n1 + n2;
        return r;
    }
}
public class ClassObjectDemo {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 8;
        Calc calculator = new Calc();
        int result = calculator.add(num1, num2);
        System.out.println("Result = " + result);
    }
}
