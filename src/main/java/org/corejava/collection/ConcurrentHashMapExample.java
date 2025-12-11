package org.corejava.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        // Adding elements
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");
        map.put(3, "C++"); // Not allowed
        map.put(4, "C++");
        // Accessing elements
        System.out.println("Value for key 2: " + map.get(2));

        // Iterating over entries
        map.forEach((key, value) ->
                System.out.println("Key: " + key + ", Value: " + value)
        );

        // Conditional update (thread-safe)
        map.putIfAbsent(5, "Go");
        map.replace(3, "C++", "C#");

        System.out.println("\nAfter putIfAbsent and replace:");
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

