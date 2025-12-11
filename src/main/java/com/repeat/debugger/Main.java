package com.repeat.debugger;

import java.util.List;

public class Main
{
    static void main()
    {
        List<Employee> employeeList = EmployeeDao.getEmployees();

        List<String> filteredList = employeeList
                .stream()
                .filter(e -> e.getAge() > 29)
                .map(Employee::getEmail)
                .distinct()
                .sorted()
                .skip(0)
                .limit(3)
                .toList();

        System.out.println(filteredList);
    }
}
