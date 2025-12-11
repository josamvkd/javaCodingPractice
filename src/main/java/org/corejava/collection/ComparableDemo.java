package org.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{

    int age;
    String name;

    public Employee(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee that)
    {
        if (this.age > that.age) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class ComparableDemo
{
    public static void main(String[] args)
    {

        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee(19, "Jomon"));
        emp.add(new Employee(21, "Joby"));
        emp.add(new Employee(17, "Anu"));
        emp.add(new Employee(25, "Eiden"));
        emp.add(new Employee(31, "Clement"));

        Collections.sort(emp);

        for (Employee s : emp) {
            System.out.println(s);
        }

    }
}
