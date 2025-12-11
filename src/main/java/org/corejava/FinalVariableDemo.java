package org.corejava;

public class FinalVariableDemo {
    public static void main(String[] args) {
        final int num = 100;
        //num = 150;  java: cannot assign a value to final variable num
        System.out.println(num);
    }
}
