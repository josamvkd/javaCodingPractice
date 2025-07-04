package org.josamtechie.corejava.generics;

public class GenericsExample
{
    public static void main(String[] args)
    {
        Products<String, Double> products = new Products<>();
        products.setItem("Mobile");
        products.setPrice(4999.9);

        System.out.println("Product details -> "+products.getItem()+" : "+products.getPrice());
    }

}
