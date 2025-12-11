package org.corejava.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHMPutIfAbsentExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();

        map.put("A", "Apple");
        map.putIfAbsent("A", "Avocado"); // Won't override existing key
        map.putIfAbsent("B", "Banana");

        System.out.println(map); // Output: {A=Apple, B=Banana}
    }
}

