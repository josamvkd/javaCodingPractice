package org.josamtechie.corejava.generics;

public class Products<T, U>
{
    private T item;
    private U price;

    public Products(){}

    public Products(T item, U price){
        this.item=item;
        this.price=price;
    }


    public T getItem()
    {
        return this.item;
    }

    public U getPrice()
    {
        return this.price;
    }

    public void setItem(T item)
    {
        this.item = item;
    }

    public void setPrice(U price)
    {
        this.price = price;
    }
}
