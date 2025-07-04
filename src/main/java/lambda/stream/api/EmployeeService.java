package lambda.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService
{
    public static List<Employee> evaluateTaxUser(String input)
    {
        return (input.equalsIgnoreCase("tax")) ?
                EmployeeDAO.getEmployees().stream().filter(e -> e.getSalary() > 500000).collect(Collectors.toList()) :
                EmployeeDAO.getEmployees().stream().filter(e -> e.getSalary() <= 500000).collect(Collectors.toList());
    }

    public static void main(String[] args)
    {
        System.out.println(evaluateTaxUser("tax"));
        System.out.println(evaluateTaxUser("tax-free"));
    }
}
