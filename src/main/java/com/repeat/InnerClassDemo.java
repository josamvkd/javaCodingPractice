package com.repeat;

// Outer class should not be static class
//static class TV
class TV
{
    int x;

    public void show()
    {
        System.out.println("In TV show");
    }

    //static class LG
    class LG
    {
        public void program()
        {
            System.out.println("In LG program");
        }
    }
}

public class InnerClassDemo
{
    static void main()
    {
        TV obj = new TV();
        obj.show();

        // Obj reference should be outer class
        // object of inner class should be created using the object of outer class
        // only for non-static inner class
        TV.LG obj2 = obj.new LG(); // if non static inner class
        //TV.LG obj2 = new TV.LG(); // if static inner class
        obj2.program();
    }
}
