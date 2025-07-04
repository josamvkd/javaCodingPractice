package com.josamtechie.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    public Student()
    {
    }

    public Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student that)
    {
        if (this.age > that.age) {
            return 1;
        }else{
            return -1;

        }
    }
}

public class ComparableDemo
{
    public static void main(String[] args)
    {
        List<Student> list = new ArrayList<>();
        list.add(new Student(25, "Arun"));
        list.add(new Student(31, "Kiran"));
        list.add(new Student(40, "Manu"));
        list.add(new Student(19, "Binu"));
        list.add(new Student(59, "Balu"));
        list.add(new Student(23, "Kris"));

        Collections.sort(list);
        for (Student s : list) {
            System.out.println(s);
        }
    }

}
