package org.josamtechie.corejava.collection;

import java.util.LinkedList;

public class LinkedListExample
{
    public static void main(String[] args)
    {
        // Creating a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();
        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.addFirst("Orange"); // Add to beginning
        fruits.addLast("Grapes"); // Add to end

        // Removing elements
        fruits.remove("Banana");
        fruits.removeFirst(); // Removes "Orange"
        fruits.removeLast(); // Removes "Grapes"

        System.out.println("----------------------");
        // Accessing elements
        System.out.println("First Fruit : "+fruits.getFirst()); // Apple
        System.out.println("Last Fruit : "+fruits.getLast()); // Dragon Fruit

        System.out.println("----------------------");
        // Modify elementr
        fruits.set(1,"Dragon Fruit");

        // Iterating over the LinkedList
        System.out.println("All fruits : ");
        System.out.println("----------------------");
        for (String fruit : fruits){
            System.out.println(fruit);
        }

        System.out.println("----------------------");
        // Check size
        System.out.println("Total fruits: " + fruits.size());
    }
}
