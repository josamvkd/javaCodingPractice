package lambda.parallel_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDataBase
{
    public static List<Employee> getEmployees(){
        List<Employee> employeeList = new ArrayList<>();
        for (int i=1;i<=10000;i++){
            employeeList.add(new Employee(i,"employee"+i,"A", (double) new Random().nextInt(1000 * 100)));
        }
        return employeeList;
    }
}
