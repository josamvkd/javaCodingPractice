package org.corejava.collection;

import java.util.ArrayList;
import java.util.List;

public class ListDemo
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Orange");
        list.add("Banana");
        list.add("Pineapple");
        list.add("Apple"); // List allow duplicate element
        list.add("Papaya");
        list.add(null);
        list.add(null);
        System.out.println("------Index--------");
        System.out.println(list.get(2));
        System.out.println("------Size--------");
        System.out.println(list.size());
        System.out.println("-------indexOf-------");
        System.out.println(list.indexOf("Orange"));
        System.out.println("---------First&Last------------");
        System.out.println(list.getFirst()+" : "+list.getLast());
        System.out.println("-------Iteration-------");
        for (String s : list) {
            System.out.println(s); // List maintain order of insertion
        }
    }
}
