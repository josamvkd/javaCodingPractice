package org.josamtechie.corejava.collection.comparator;

public class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public static int comparePrices(Product p1, Product p2) {
        if (p1.price > p2.price) {
            return 1;
        } else if (p1.price < p2.price) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Tablet", 800.0);

        System.out.println("Price comparison result: " + comparePrices(p1, p2));
    }
}

