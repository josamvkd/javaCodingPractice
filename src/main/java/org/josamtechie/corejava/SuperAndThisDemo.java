package org.josamtechie.corejava;

class A extends Object {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int a) {
        super();
        System.out.println("In int A");
    }
}

class B extends A {

    public B() {
        super();
        System.out.println("In B");
    }

    public B(int b) {
        // super(b);
        this();
        System.out.println("In int B");
    }
}

public class SuperAndThisDemo {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}
