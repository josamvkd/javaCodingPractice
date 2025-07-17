package org.josamtechie.corejava.collection;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        // Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // Adding elements to the map
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        System.out.println("--------------------------------------------");
        // Display the HashMap
        System.out.println("Initial Map: " + map);

        System.out.println("--------------------------------------------");
        // Accessing a value
        String fruit = map.get(2);
        System.out.println("Value at key 2: " + fruit);

        System.out.println("--------------------------------------------");
        // Removing an entry
        map.remove(3);
        System.out.println("After removing key 3: " + map);

        System.out.println("--------------------------------------------");
        // Checking if a key exists
        System.out.println("Contains key 1? " + map.containsKey(1));

        System.out.println("--------------------------------------------");
        // Iterating over entries
        System.out.println("Iterating entries:");
        for (HashMap.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

