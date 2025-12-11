package org.corejava;

class Student {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {

        Student obj = new Student();
        obj.setAge(30);
        obj.setName("Jomon");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
