package org.josamtechie.corejava.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHMRemoveExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("OS", "Linux");
        map.put("MEM", "1TB");
        System.out.println("Before removing : "+map);
        map.remove("OS", "Windows"); // Fails: value doesn't match
        map.remove("OS", "Linux");   // Success

        System.out.println("After removing : "+map); // Output: {MEM=1TB}
    }
}

