package org.corejava;
class Mobile{
    String brand;
    int price;
    static String type; // static variable

    public void show(){
        System.out.println(brand+" : "+price+" : "+type);
    }
}

public class StaticVariableDemo {
    public static void main(String[] args) {

        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price =1700;
        Mobile.type="Smart Phone";

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price =1200;
        //Mobile.type="Smart Phone";

        //Mobile.type ="Normal";

        obj1.show();
        obj2.show();
    }
}
