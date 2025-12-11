package com.josamtechie.stream;

import java.util.Objects;

public class EmployeeClass {

    private int empId;
    private String name;
    private String department;
    private double salary;

    public EmployeeClass(int empId, String name, String department, double salary)
    {
        this.empId = empId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getEmpId()
    {
        return empId;
    }

    public void setEmpId(int empId)
    {
        this.empId = empId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDepartment()
    {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof EmployeeClass that)) return false;
        return getEmpId() == that.getEmpId() && Double.compare(getSalary(), that.getSalary()) == 0 && Objects.equals(getName(), that.getName()) && Objects.equals(getDepartment(), that.getDepartment());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getEmpId(), getName(), getDepartment(), getSalary());
    }

    @Override
    public String toString()
    {
        return "EmployeeClass{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
