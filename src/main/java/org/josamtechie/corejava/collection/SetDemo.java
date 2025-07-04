package org.josamtechie.corejava.collection;

import java.util.HashSet;
import java.util.Set;

public class SetDemo
{
    public static void main(String[] args)
    {

        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Orange");
        set.add("Banana");
        set.add("Pineapple");
        set.add("Apple"); // List does not allow duplicate element
        set.add("Papaya");
        set.add(null); // At most one null
        System.out.println("-----Iteration----------");
        for (String s : set)
        {
            System.out.println(s); // Set does not maintain order of insertion
        }
    }
}
