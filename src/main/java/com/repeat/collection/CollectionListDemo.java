package com.repeat.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionListDemo
{
    static void main()
    {
        // List-Interface ArrayList- Class
        // ArrayList allow duplicates elements to store
        // ArrayList MaintainOrderOf insertion
        // ArrayList having the index value since it maintain the order of insertion
        List<Integer> numbs = new ArrayList<>();
        numbs.add(5);
        numbs.add(3);
        numbs.add(6);
        numbs.add(2);
        numbs.add(1);
        numbs.add(3);
        numbs.add(5);
        System.out.println("Index of 2 : "+numbs.get(2));
        for (int n: numbs){
            System.out.println(n);
        }
    }
}
