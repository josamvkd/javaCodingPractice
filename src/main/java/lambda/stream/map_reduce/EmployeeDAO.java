package lambda.stream.map_reduce;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO
{
    public static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101,"Roshan","A",600000));
        employeeList.add(new Employee(109,"Bikash","B",900000));
        employeeList.add(new Employee(102,"Bimal","A",500000));
        employeeList.add(new Employee(103,"Sourav","A",400000));
        employeeList.add(new Employee(104,"Prakash","C",1200000));
        return employeeList;
    }
}
