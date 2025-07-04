package lambda.parallel_stream;

import java.util.List;

public class EmployeeService
{


    public static void main(String[] args)
    {
        long start=0;
        long end =0;
        List<Employee> employees = EmployeeDataBase.getEmployees();
        // Normal stream
        start = System.currentTimeMillis();
        double salaryWithStream = employees.stream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Normal stream took time : "+(end-start)+"ms - Avg Salary : "+salaryWithStream);
        System.out.println("============");
        start = System.currentTimeMillis();
        double salaryWithParallelStream = employees.parallelStream()
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble();
        end = System.currentTimeMillis();
        System.out.println("Parallel stream took time : "+(end-start)+"ms - Avg Salary : "+salaryWithParallelStream);

    }
}
