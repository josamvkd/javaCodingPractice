package org.josamtechie.corejava;
class Phone{
    String brand;
    int price;
    static String type="Mobile Phone";

    public void show(){
        System.out.println("---Normal Method ------");
        System.out.println(brand+" : "+price+" : "+type);
    }

    public static void show1(Phone obj1){
        System.out.println("---static Method ------");
        System.out.println(obj1.brand+" : "+obj1.price+" : "+type);
    }

//    public static void show2(){
//        System.out.println("---In static Method ------");
//    }
}

public class StaticMethodDemo {
    public static void main(String[] args) {

        Phone obj1 = new Phone();
        obj1.brand ="Apple";
        obj1.price =1700;
        //Phone.type="Smart Phone";

        Phone obj2 = new Phone();
        obj2.brand ="Samsung";
        obj2.price =1200;
        //Mobile.type="Smart Phone";

        obj1.show();
        obj2.show();
        Phone.show1(obj1);
        //Phone.show2();


    }
}
