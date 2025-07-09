package com.josamtechie.java16_record_class;

import java.util.Objects;

record Person(int age, String name){}

//What is a Record in Java?
// A record is a special class in Java introduced to reduce boilerplate code
// for immutable data carriers (POJOs or DTOs).
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
