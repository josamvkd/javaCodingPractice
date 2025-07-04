package org.josamtechie.corejava.collection.comparator;

import java.util.*;

public class StringSorter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Sort in descending order
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.compareTo(s2) < 0) {
                    return 1;   // s1 comes after s2
                } else if (s1.compareTo(s2) > 0) {
                    return -1;  // s1 comes before s2
                } else {
                    return 0;   // equal
                }
            }
        });

        System.out.println("Sorted names in descending order: " + names);
    }
}
