package lambda.stream.sort.list;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO
{
    public static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(176,"Roshan","IT",600000));
        employeeList.add(new Employee(388,"Bikash","CIVIL",900000));
        employeeList.add(new Employee(470,"Bimal","DEFENCE",500000));
        employeeList.add(new Employee(624,"Sourav","CORE",400000));
        employeeList.add(new Employee(176,"Prakash","SOCIAl",1200000));
        return employeeList;
    }
}
