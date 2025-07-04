package org.josamtechie.corejava;

class Person{
    private int age;
    private String name;

    // Constructor
    public Person(){
        age = 34;
        name = "Samuel";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {

        Person obj = new Person();
        System.out.println(obj.getName() + " : " + obj.getAge());
        //obj.setAge(30);
        //obj.setName("Jomon");
        //System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
