package com.repeat;

class Human
{
    private String name;
    private int age;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}

public class EncapsulationDemo
{
    static void main(String[] args)
    {
        Human obj = new Human();
        obj.setName("Jomon");
        obj.setAge(34);
        System.out.println(obj.getName()+" : "+obj.getAge());
    }
}
