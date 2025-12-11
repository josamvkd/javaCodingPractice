package org.corejava.collection;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHMReplaceExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
        map.put("Java", "Spring");

        map.replace("Java", "Spring", "Spring Boot"); // Conditional replace
        map.replace("Python", "Django");              // Won't do anything (key not present)

        System.out.println(map); // Output: {Java=Spring Boot}
    }
}

