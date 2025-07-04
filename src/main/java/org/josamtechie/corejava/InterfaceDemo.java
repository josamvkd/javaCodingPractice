package org.josamtechie.corejava;

interface OriginalInterface
{
    int id = 1001; // by default final and static
    String name = "Test"; // by default final and static
    void show();
    void hide();
}

class ImplClass implements OriginalInterface
{

    @Override
    public void show()
    {
        System.out.println("In show");
    }

    @Override
    public void hide()
    {
        System.out.println("In hide");
    }
}

public class InterfaceDemo
{
    public static void main(String[] args)
    {
        OriginalInterface obj = new ImplClass();
        obj.show();
        obj.hide();
        System.out.println(OriginalInterface.id + " : " + OriginalInterface.name);
    }
}
