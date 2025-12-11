package org.corejava.collection;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple");  // Duplicate, won't be added

        // Adding null
        fruits.add(null);

        System.out.println("--------------------------------------------");
        // Display elements
        System.out.println("1. Fruits HashSet: " + fruits);

        System.out.println("--------------------------------------------");
        // Check if an element exists
        System.out.println("2. Contains Banana? " + fruits.contains("Banana"));

        // Remove an element
        fruits.remove("Orange");

        System.out.println("--------------------------------------------");
        System.out.println("3. After removing Orange: " + fruits);

        System.out.println("--------------------------------------------");
        // Iterating using for-each
        System.out.println("4. Iterating HashSet:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}

