package org.corejava.collection;

import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<String> fruits = new ArrayList<>();
        // Add elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Banana"); // Allows duplicates

        // Access elements
        System.out.println("First fruit: " + fruits.get(0)); // Apple
        System.out.println("First fruit : " + fruits.getFirst());
        System.out.println("Last fruit : " + fruits.getLast());

        // Modify element
        fruits.set(1, "Orange");

        // Remove element
        fruits.remove("Mango");

        System.out.println("----------------------");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("----------------------");
        // Check size
        System.out.println("Total fruits: " + fruits.size());

    }
}
