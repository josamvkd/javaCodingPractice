package org.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{

    int age;
    String name;

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
}

public class StudentComparatorDemo
{
    public static void main(String[] args)
    {
        Comparator<Student> com = new Comparator<Student>()
        {
            @Override
            public int compare(Student i, Student j)
            {
                if (i.age > j.age) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student(19, "Jomon"));
        stud.add(new Student(21, "Joby"));
        stud.add(new Student(17, "Anu"));
        stud.add(new Student(25, "Eiden"));
        stud.add(new Student(31, "Clement"));

        Collections.sort(stud, com);

        for (Student s : stud) {
            System.out.println(s);
        }
    }
}
