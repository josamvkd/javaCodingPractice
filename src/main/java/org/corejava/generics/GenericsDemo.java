package org.corejava.generics;

public class GenericsDemo
{
    public static void main(String[] args)
    {
        Box<String> box1 = new Box<>();
        box1.setItem("Test Box");
        Box<Integer> box2 = new Box<>();
        box2.setItem(12);
        Box<Double> box3 = new Box<>();
        box3.setItem(45.6);
        Box<Boolean> box4 = new Box<>();
        box4.setItem(true);

        System.out.println("Type String  -> "+box1.getItem());
        System.out.println("Type Integer -> "+box2.getItem());
        System.out.println("Type Double  -> "+box3.getItem());
        System.out.println("Type Boolean -> "+box4.getItem());
    }
}
