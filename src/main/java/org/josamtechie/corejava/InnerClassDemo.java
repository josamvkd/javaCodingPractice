package org.josamtechie.corejava;

class ClassA {

    int id;

    public void show()
    {
        System.out.println("In ClassA show");
    }

    class InnerClassB
    {
        public void innerBShow()
        {
            System.out.println("In inner class show");
        }
    }
    static class InnerClassC
    {
        public void innerCShow()
        {
            System.out.println("In inner C class show");
        }
    }
}

public class InnerClassDemo
{
    public static void main(String[] args)
    {
        ClassA obj1 = new ClassA();
        obj1.show();
        ClassA.InnerClassB obj2 = obj1.new InnerClassB();
        obj2.innerBShow();
        ClassA.InnerClassC obj3 = new ClassA.InnerClassC();
        obj3.innerCShow();

    }
}
