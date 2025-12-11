package com.repeat.debugger;

import java.util.List;
import java.util.stream.Stream;

public class EmployeeDao
{
    public static List<Employee> getEmployees(){
      return Stream.of(
              new Employee(101, "Arun Kumar", "arun.kumar@example.com", 25, 35000.0),
              new Employee(102, "Neha Sharma", "neha.sharma@example.com", 28, 42000.0),
              new Employee(103, "Ravi Menon", "ravi.menon@example.com", 32, 52000.0),
              new Employee(104, "Sana Khan", "sana.khan@example.com", 27, 39000.0),
              new Employee(105, "Vijay Raj", "vijay.raj@example.com", 30, 48000.0),
              new Employee(106, "Meera Das", "meera.das@example.com", 26, 36000.0),
              new Employee(107, "Ajay Thomas", "ajay.thomas@example.com", 29, 45000.0),
              new Employee(108, "Pooja Patel", "pooja.patel@example.com", 31, 41000.0),
              new Employee(109, "Kiran George", "kiran.george@example.com", 33, 55000.0),
              new Employee(110, "Lakshmi Nair", "lakshmi.nair@example.com", 24, 34000.0),
              new Employee(111, "Suresh Babu", "suresh.babu@example.com", 28, 46000.0),
              new Employee(112, "Nisha Varma", "nisha.varma@example.com", 30, 37000.0),
              new Employee(113, "Deepak Singh", "deepak.singh@example.com", 34, 53000.0),
              new Employee(114, "Aisha Ali", "aisha.ali@example.com", 27, 38000.0),
              new Employee(109, "Kiran George", "kiran.george@example.com", 33, 55000.0),
              new Employee(107, "Ajay Thomas", "ajay.thomas@example.com", 29, 45000.0),
              new Employee(101, "Arun Kumar", "arun.kumar@example.com", 25, 35000.0),
              new Employee(104, "Sana Khan", "sana.khan@example.com", 27, 39000.0),
              new Employee(115, "Harish Kumar", "harish.kumar@example.com", 35, 60000.0)
      ).toList();

    }
}
