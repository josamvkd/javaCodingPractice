package org.josamtechie.corejava.generics;

public class Box<T>
{
    private T item;

    public Box() {}

    public Box(T item)
    {
        this.item = item;
    }

    public T getItem()
    {
        return this.item;
    }

    public void setItem(T item)
    {
        this.item = item;
    }
}
