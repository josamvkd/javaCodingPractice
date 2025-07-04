package org.josamtechie.corejava;

class DefaultConstructor {
    private int age;
    private String name;

    // Default Constructor
    public DefaultConstructor() {
        age = 1;
        name = "Eiden";
    }

    // Parameterised Constructor
    public DefaultConstructor(int age, String name) {
        this.age = age;
        this.name = name;
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

public class DefaultConstructorDemo {
    public static void main(String[] args) {
        DefaultConstructor obj1 = new DefaultConstructor();
        DefaultConstructor obj2 = new DefaultConstructor(35, "Jomon");
        System.out.println(obj1.getName() + " : " + obj1.getAge());
        System.out.println(obj2.getName() + " : " + obj2.getAge());

    }
}
