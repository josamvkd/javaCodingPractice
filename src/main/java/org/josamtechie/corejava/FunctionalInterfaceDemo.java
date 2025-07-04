package org.josamtechie.corejava;

@FunctionalInterface
interface Flower
{
    //void show();
    //void show(int i);
    int add(int i, int j);
}

public class FunctionalInterfaceDemo
{
    public static void main(String[] args)
    {
//        Flower obj = () -> System.out.println("In show");
//        obj.show();
//        Flower obj = i -> System.out.println("In show "+i);
//        obj.show(2);
        Flower obj = (i, j) -> i + j;
        int result = obj.add(2, 3);
        System.out.println(result);
    }
}
