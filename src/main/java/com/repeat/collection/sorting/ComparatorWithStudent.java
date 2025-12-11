package com.repeat.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    private int age;
    private String name;

    public Student(int age, String name)
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
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorWithStudent
{
    static void main()
    {
        Comparator<Student> com = (i,j) ->{
            if(i.getAge() >j.getAge())
                return 1;
            else
                return -1;
        };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(25,"Jomon"));
        stud.add(new Student(27,"Joby"));
        stud.add(new Student(18,"Vishnu"));
        stud.add(new Student(16,"Anu"));
        stud.add(new Student(31,"Eiden"));

        Collections.sort(stud, com);

        for (Student s : stud){
            System.out.println(s);
        }


    }
}
