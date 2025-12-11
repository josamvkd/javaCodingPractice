package org.corejava;

class C {
    public C() {
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("In show ");
    }
}

public class AnonymousObjectDemo {
    public static void main(String[] args) {
        //new C(); // Anonymous object
        new C().show(); // to call the method
        // this object can use only once
    }
}
