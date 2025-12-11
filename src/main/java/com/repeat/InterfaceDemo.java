package com.repeat;

interface Camera
{
    // All the variables inside interface are static and final
    // Interface don't have its own memory in heep so it is a final
    // Static because the implementation class only implement the method not variables
    // By default the below variables are static final
    //    static final String model="Canon";
    //    static final int price=8000;
    String model = "Canon";
    int price = 8000;

    // All the methods in interfaces are by default public
    //    public void zoomIn();
    //    public void zoomOut();
    void zoomIn();

    void zoomOut();
}

class CameraImpl implements Camera
{
    public void zoomIn()
    {
        System.out.println("In CameraImpl zoomIn ");
    }

    public void zoomOut()
    {
        System.out.println("In CameraImpl zoomOut");
    }
}

public class InterfaceDemo
{
    static void main()
    {
        Camera obj = new CameraImpl();
        obj.zoomIn();
        obj.zoomOut();

        // Value cannot be modified since the model and price fields are final
        // Camera.model ="Nikon";
        // Camera.price=9000;
        System.out.println(Camera.model + " : " + Camera.price);

    }
}
