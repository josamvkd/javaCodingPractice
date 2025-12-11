package org.corejava;

class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

//    public void setAge(int age, Human obj) {
//        Human obj1 =obj;
//        obj1.age = age;
//        //this.age = age;
//    }

    public void setAge(int age) {
        // This Keyword
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ThisKeywordDemo {

    public static void main(String[] args) {
        Human obj = new Human();
        //obj.setAge(30, obj);
        obj.setAge(30);
        obj.setName("Jomon");
        System.out.println(obj.getName() + " : " + obj.getAge());
    }
}
