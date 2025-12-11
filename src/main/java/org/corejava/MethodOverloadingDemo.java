package org.corejava;

class NewCalculator {

    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public double add(double n1, double n2) {
        return n1 + n2;
    }
}

public class MethodOverloadingDemo {
    public static void main(String[] args) {

        NewCalculator obj = new NewCalculator();
        int result1 = obj.add(4, 3);
        int result2 = obj.add(2, 4, 6);
        double result3 = obj.add(2.5, 3.4);
        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);
    }
}
