package lambda.method_reference;

import java.util.Objects;

public class EmployeeDTO
{
    private int id;
    private String name;
    private double salary;

    public EmployeeDTO()
    {
        super();
    }

    public EmployeeDTO(int id, String name, double salary)
    {
        this.id = id;
        this.name = name;
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
        if (!(o instanceof EmployeeDTO that)) return false;
        return getId() == that.getId() && Double.compare(getSalary(), that.getSalary()) == 0 && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getId(), getName(), getSalary());
    }

    @Override
    public String toString()
    {
        return "EmployeeDTO{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
