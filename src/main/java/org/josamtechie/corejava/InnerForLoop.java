package org.josamtechie.corejava;

public class InnerForLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("Hi : " + i);
            for (int j = 1; j <= 4; j++) {
                System.out.println("Hello : " + j);
            }
        }
    }
}
