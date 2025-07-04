package lambda.stream.sort.list;

import java.util.Objects;

public class Employee
{
    private int id;
    private String name;
    private String dept;
    private long salary;

    public Employee()
    {
        super();
    }

    public Employee(int id, String name, String dept, long salary)
    {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDept()
    {
        return dept;
    }

    public void setDept(String dept)
    {
        this.dept = dept;
    }

    public long getSalary()
    {
        return salary;
    }

    public void setSalary(long salary)
    {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Employee employee)) return false;
        return getId() == employee.getId() && getSalary() == employee.getSalary() && Objects.equals(getName(), employee.getName()) && Objects.equals(getDept(), employee.getDept());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getId(), getName(), getDept(), getSalary());
    }

    @Override
    public String toString()
    {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", dept='" + dept + '\'' + ", salary=" + salary + '}';
    }
}
