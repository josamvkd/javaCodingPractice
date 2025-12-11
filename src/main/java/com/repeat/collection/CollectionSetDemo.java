package com.repeat.collection;

import java.util.HashSet;
import java.util.Set;

public class CollectionSetDemo
{
    static void main()
    {
        // Set - Interface - HashSet is Class
        // HashSet does not allow to store duplicate elements
        // HashSet does not maintain order of insertion
        // HashSet does not have the index value since it does not maintain the order of insertion
        Set<Integer> numbs = new HashSet<>();
        numbs.add(55);
        numbs.add(33);
        numbs.add(66);
        numbs.add(22);
        numbs.add(11);
        numbs.add(33);
        numbs.add(55);
        //System.out.println("Index of 2 : "+numbs.get(2)); // does not have the index value
        for(int n :numbs){
            System.out.println(n);
        }
    }
}
