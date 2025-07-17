package org.josamtechie.corejava.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHMIterationExample {
    public static void main(String[] args) {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");

        // This won't throw ConcurrentModificationException
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
            if (key == 2) {
                map.put(4, "D"); // Safe modification during iteration
            }
        }

        System.out.println("Final Map: " + map);
    }
}

