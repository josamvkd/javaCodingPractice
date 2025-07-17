package org.josamtechie.corejava.collection;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        // Append
        sb.append(" Programming");
        System.out.println("After append: " + sb);

        // Insert
        sb.insert(4, " Language");
        System.out.println("After insert: " + sb);

        // Replace
        sb.replace(5, 13, "Core");
        System.out.println("After replace: " + sb);

        // Delete
        sb.delete(5, 9);
        System.out.println("After delete: " + sb);

        // Reverse
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

