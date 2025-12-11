package org.corejava;

class Computer {

    public int add(int i, int j) {
        return i + j;
    }
}

class Laptop extends Computer {
    public int add(int i, int j) {
        return (i + j) * 2;
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        Laptop obj = new Laptop();
        int r1 = obj.add(2, 4);
        System.out.println(r1);
    }
}
