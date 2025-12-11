package org.corejava.collection;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder("Hello");

        // Append text
        sb.append(" World");
        System.out.println("After append: " + sb);  // Hello World

        // Insert text at index 5
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);  // Hello, World

        // Replace text from index 6 to 11
        sb.replace(6, 11, "Java");
        System.out.println("After replace: " + sb);  // Hello, Java

        // Delete characters from index 5 to 6
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);  // Hello Java

        // Reverse the string
        sb.reverse();
        System.out.println("After reverse: " + sb);  // avaJ olleH
    }
}

