package com.repeat.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee implements Comparable<Employee>
{
    private int age;
    private String name;

    public Employee(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    public int getAge()
    {
        return age;
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
    public int compareTo(Employee emp)
    {
        if(this.age >emp.age)
            return 1;
        else
            return -1;
    }
}

public class ComparableWithEmployee
{

    static void main()
    {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(25,"Jomon"));
        employees.add(new Employee(27,"Joby"));
        employees.add(new Employee(18,"Vishnu"));
        employees.add(new Employee(16,"Anu"));
        employees.add(new Employee(31,"Eiden"));

        Collections.sort(employees);

        for (Employee s : employees){
            System.out.println(s);
        }

    }
}
