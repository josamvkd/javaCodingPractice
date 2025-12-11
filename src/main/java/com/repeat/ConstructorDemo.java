package com.repeat;

class Hospital
{
    private String doctors;
    private String nurses;

    public Hospital(){
        System.out.println("In constructor!!");
    }

    public String getDoctors()
    {
        return doctors;
    }

    public void setDoctors(String doctors)
    {
        this.doctors = doctors;
    }

    public String getNurses()
    {
        return nurses;
    }

    public void setNurses(String nurses)
    {
        this.nurses = nurses;
    }
}

public class ConstructorDemo
{
    static void main(String[] args)
    {
        Hospital obj1 = new Hospital(); // Constructor will call when the object is created
        Hospital obj2 = new Hospital(); // Constructor will call when the object is created

    }
}
