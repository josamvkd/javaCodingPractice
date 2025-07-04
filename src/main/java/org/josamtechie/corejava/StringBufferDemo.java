package org.josamtechie.corejava;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Jomon");
//        System.out.println(sb.capacity());
//        System.out.println(sb.length());
        sb.append(" Samuel Thomas");
        System.out.println(sb);
        System.out.println(sb.substring(3,5));


        String name = sb.toString();
        System.out.println(name);
    }
}
