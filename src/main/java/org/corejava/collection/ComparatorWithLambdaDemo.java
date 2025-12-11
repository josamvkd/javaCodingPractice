package org.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NewStudent
{

    int age;
    String name;

    public NewStudent(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "NewStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ComparatorWithLambdaDemo
{
    public static void main(String[] args)
    {

        Comparator<NewStudent> com = (i,j) ->i.age>j.age?1:-1;

        List<NewStudent> stud = new ArrayList<>();
        stud.add(new NewStudent(19, "Jomon"));
        stud.add(new NewStudent(21, "Joby"));
        stud.add(new NewStudent(17, "Anu"));
        stud.add(new NewStudent(25, "Eiden"));
        stud.add(new NewStudent(31, "Clement"));

        Collections.sort(stud, com);

        for (NewStudent s : stud) {
            System.out.println(s);
        }
    }
}







