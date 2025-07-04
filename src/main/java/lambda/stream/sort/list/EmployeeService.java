package lambda.stream.sort.list;

import lambda.stream.api.Employee;
import lambda.stream.api.EmployeeDAO;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService
{


    public static void main(String[] args)
    {
        List<Employee> employeeList = EmployeeDAO.getEmployees();

        Collections.sort(employeeList, ( o1,  o2) -> (int) (o1.getSalary() - o2.getSalary()));
       // System.out.println(employeeList);

        //employeeList.stream().sorted(( o1,  o2) -> (int) (o1.getSalary() - o2.getSalary())).forEach(System.out::println);
        //employeeList.stream().sorted(Comparator.comparing(emp ->emp.getSalary())).forEach(System.out::println);
        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);
    }
}

