package lambda.stream_debugger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDataBase
{
    public static List<Employee> getEmployees(){

        return Stream.of(new Employee(101,"Jomon","DEV",50000),
                new Employee(102,"Samuel","FS",70000),
                new Employee(103,"Thomas","QA",40000),
                new Employee(105,"Balram","DEV",80000),
                new Employee(107,"Ajay","DEV",90000),
                new Employee(104,"Basanth","QA",40000),
                new Employee(106,"Jomon","DEV",50000),
                new Employee(154,"Ram","QA",100000),
                new Employee(112,"Vishnu","UI",30000),
                new Employee(205,"Samuel","ADMIN",35000),
                new Employee(255,"Niyas","CS",200000)
        ).collect(Collectors.toList());
    }
}
