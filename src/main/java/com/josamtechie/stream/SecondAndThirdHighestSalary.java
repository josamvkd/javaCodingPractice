package com.josamtechie.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

class Employee
{
    private String name;
    private double salary;

    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    public String getName()
    {
        return name;
    }

    public double getSalary()
    {
        return salary;
    }
}

public class SecondAndThirdHighestSalary
{
    public static void main(String[] args)
    {
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Alice", 70000),
                new Employee("Bob", 90000),
                new Employee("David", 70000),
                new Employee("Emma", 80000)
        );

        // Get second highest salary
        Optional<Double> secondHighest = employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        // Get third highest salary
        Optional<Double> thirdHighest = employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst();

        System.out.println("Second Highest Salary: " + secondHighest.orElse(-1.0));
        System.out.println("Third Highest Salary: " + thirdHighest.orElse(-1.0));
    }
}
