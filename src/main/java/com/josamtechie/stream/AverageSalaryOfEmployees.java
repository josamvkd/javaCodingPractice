package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;

public class AverageSalaryOfEmployees
{
    static void main()
    {
        List<EmployeeClass> employee = Arrays.asList(
                new EmployeeClass(1, "Jomon", "IT", 85000.00),
                new EmployeeClass(2, "Samuel", "Finance", 65000.00),
                new EmployeeClass(3, "Thomas", "HR", 55000.00),
                new EmployeeClass(4, "Anita", "Marketing", 72000.00),
                new EmployeeClass(5, "Rahul", "Sales", 60000.00)
        );
        double avg = employee.stream()
                .mapToDouble(EmployeeClass::getSalary)
                .average()
                .getAsDouble();
        System.out.println("Average Salary : "+avg);

    }
}
