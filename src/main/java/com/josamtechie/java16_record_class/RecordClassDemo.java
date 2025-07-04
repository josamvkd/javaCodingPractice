package com.josamtechie.java16_record_class;

import java.util.Objects;

record Person(int age, String name){}

/*class Person
{
 private int age;
 private String name;

    public Person(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Person person)) return false;
        return getAge() == person.getAge() && Objects.equals(getName(), person.getName());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getAge(), getName());
    }
}*/



//What is a Record in Java?
// A record is a special class in Java introduced to reduce boilerplate code for immutable data carriers (POJOs or DTOs).
public class RecordClassDemo
{
    public static void main(String[] args)
    {

        Person person1 = new Person(34,"Jomon");
        Person person2 = new Person(34,"Jomon");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.equals(person2));

    }
}
