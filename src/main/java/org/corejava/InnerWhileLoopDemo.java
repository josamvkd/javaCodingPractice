package org.corejava;

public class InnerWhileLoopDemo {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 4) {
            System.out.println("I : " + i);
            i++;
            int j = 1;
            while (j <= 3) {
                System.out.println("J : " + j);
                j++;
            }
        }
        System.out.println("END : " + i);
    }
}
