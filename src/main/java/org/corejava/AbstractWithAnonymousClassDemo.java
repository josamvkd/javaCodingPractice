package org.corejava;

abstract class AbstractClassA
{
    public abstract void show();
    public abstract void hide();
}

public class AbstractWithAnonymousClassDemo
{
    public static void main(String[] args)
    {
        AbstractClassA obj = new AbstractClassA()
        {
            @Override
            public void show()
            {
                System.out.println("In abstract Anonymous method Show");
            }
            @Override
            public void hide()
            {
                System.out.println("In abstract Anonymous method hide");
            }
        };
        obj.show();
        obj.hide();
    }
}
