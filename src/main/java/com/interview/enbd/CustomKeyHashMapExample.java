package com.interview.enbd;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Employee
{
    private int id;
    private String name;

    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Employee employee)) return false;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(id, name);
    }

    @Override
    public String toString()
    {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}


public class CustomKeyHashMapExample
{
    public static void main(String[] args)
    {

        Map<Employee, String> map = new HashMap<>();
        Employee e1 = new Employee(101,"Jomon");
        Employee e2 = new Employee(102,"Anu");
        Employee e3 = new Employee(103,"Eiden");

        map.put(e1,"Father");
        map.put(e2,"Mother");
        map.put(e3,"Son");

        map.forEach((employee, relation) -> System.out.println(employee+" => "+relation));
    }
}
