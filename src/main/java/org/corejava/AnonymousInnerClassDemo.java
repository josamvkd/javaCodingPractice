package org.corejava;

class OriginalClass
{
    public void show()
    {
        System.out.println("In Original Class show");
    }
}

public class AnonymousInnerClassDemo
{
    public static void main(String[] args)
    {
        OriginalClass obj = new OriginalClass()
        {
            public void show()
            {
                System.out.println("In Anonymous Class show");
            }
        };
        obj.show();
    }
}
