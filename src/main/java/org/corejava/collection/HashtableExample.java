package org.corejava.collection;

import java.util.Hashtable;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<Integer, String> students = new Hashtable<>();

        // Add key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");

        System.out.println("--------------------------------------------");
        // Display all entries
        System.out.println("Student Hashtable: " + students);

        System.out.println("--------------------------------------------");
        // Get value by key
        System.out.println("Student with ID 102: " + students.get(102));

        System.out.println("--------------------------------------------");
        // Check if a key exists
        System.out.println("Contains key 101? " + students.containsKey(101));

        System.out.println("--------------------------------------------");
        // Check if a value exists
        System.out.println("Contains value 'Charlie'? " + students.containsValue("Charlie"));

        System.out.println("--------------------------------------------");
        // Remove a key-value pair
        students.remove(103);
        System.out.println("After removing ID 103: " + students);
    }
}

