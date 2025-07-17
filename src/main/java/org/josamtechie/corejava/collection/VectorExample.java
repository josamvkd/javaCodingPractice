package org.josamtechie.corejava.collection;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> fruits = new Vector<>();

        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple"); // allows duplicates

        System.out.println("--------------------------------------------");
        // Access element
        System.out.println("First Fruit: " + fruits.get(0));

        System.out.println("--------------------------------------------");
        // Iterate using for-each loop
        System.out.println("All Fruits:");
        System.out.println("------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Remove element
        fruits.remove("Banana");

        System.out.println("--------------------------------------------");
        // Size of the vector
        System.out.println("Size after removal: " + fruits.size());
    }
}

