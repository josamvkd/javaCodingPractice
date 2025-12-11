package com.repeat.collection;

import java.util.Set;
import java.util.TreeSet;

public class CollectionTreeSetDemo
{
    static void main()
    {
        // Set - Interface - TreeSet is Class
        // TreeSet does not allow to store duplicate elements
        // TreeSet maintain the order in ascending order
        // TreeSet<E> extends AbstractSet<E> implements NavigableSet<E>
        // NavigableSet<E> extends SortedSet<E>
        Set<Integer> numbs = new TreeSet<>();
        numbs.add(55);
        numbs.add(33);
        numbs.add(66);
        numbs.add(22);
        numbs.add(11);
        numbs.add(33);
        numbs.add(55);
        numbs.add(44);
        //System.out.println("Index of 2 : "+numbs.get(2)); // does not have the index value
        for(int n :numbs){
            System.out.println(n);
        }
    }
}
