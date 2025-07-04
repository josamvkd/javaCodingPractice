package lambda.stream_debugger;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeService
{


    public static void main(String[] args)
    {
        List<String> names = EmployeeDataBase.getEmployees()
                .stream()
                .filter(i -> i.getSalary() > 40000)
                .map(Employee::getName)
                .distinct()
                .sorted()
                .skip(0)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(names);
    }
}
