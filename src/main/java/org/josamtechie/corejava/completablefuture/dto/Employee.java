package org.josamtechie.corejava.completablefuture.dto;

import java.util.Objects;

public class Employee
{
    private String employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private String gender;
    private String newJoiner;
    private String learningPending;
    private int salary;
    private int rating;

    public Employee()
    {
    }

    public Employee(String employeeId, String firstName, String lastName, String email, String gender, String newJoiner, String learningPending, int salary, int rating)
    {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.newJoiner = newJoiner;
        this.learningPending = learningPending;
        this.salary = salary;
        this.rating = rating;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getNewJoiner()
    {
        return newJoiner;
    }

    public void setNewJoiner(String newJoiner)
    {
        this.newJoiner = newJoiner;
    }

    public String getLearningPending()
    {
        return learningPending;
    }

    public void setLearningPending(String learningPending)
    {
        this.learningPending = learningPending;
    }

    public int getSalary()
    {
        return salary;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getRating()
    {
        return rating;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o)
    {
        if (!(o instanceof Employee employee)) return false;
        return getSalary() == employee.getSalary() && getRating() == employee.getRating() && Objects.equals(getEmployeeId(), employee.getEmployeeId()) && Objects.equals(getFirstName(), employee.getFirstName()) && Objects.equals(getLastName(), employee.getLastName()) && Objects.equals(getEmail(), employee.getEmail()) && Objects.equals(getGender(), employee.getGender()) && Objects.equals(getNewJoiner(), employee.getNewJoiner()) && Objects.equals(getLearningPending(), employee.getLearningPending());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(getEmployeeId(), getFirstName(), getLastName(), getEmail(), getGender(), getNewJoiner(), getLearningPending(), getSalary(), getRating());
    }

    @Override
    public String toString()
    {
        return "Employee{" + "employeeId='" + employeeId + '\'' + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", gender='" + gender + '\'' + ", newJoiner='" + newJoiner + '\'' + ", learningPending='" + learningPending + '\'' + ", salary=" + salary + ", rating=" + rating + '}';
    }
}
