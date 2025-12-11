package com.repeat.collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class IteratorDemo
{
    static void main()
    {
        Set<Integer> numbs = new TreeSet<>();
        numbs.add(5);
        numbs.add(4);
        numbs.add(2);
        numbs.add(1);
        numbs.add(3);


        Iterator<Integer> value = numbs.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }
    }
}
