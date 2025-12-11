package org.corejava.collection;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adding elements to TreeMap
        map.put(3, "Apple");
        map.put(1, "Banana");
        map.put(2, "Cherry");
        map.put(5, "Date");
        map.put(4, "Elderberry");

        System.out.println("--------------------------------------------");
        // Printing TreeMap
        System.out.println("TreeMap (Sorted by Keys):");
        for (Integer key : map.keySet()) {
            System.out.println(key + " => " + map.get(key));
        }

        System.out.println("--------------------------------------------");
        // Accessing first and last entries
        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());
    }
}

