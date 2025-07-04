package lambda.stream.sort.map;

import lambda.stream.api.Employee;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class EmployeeService
{


    public static void main(String[] args)
    {
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1, o2) -> (int) (o1.getSalary() - o2.getSalary()));
        employeeMap.put(new Employee(176, "Roshan", "IT", 600000), 60);
        employeeMap.put(new Employee(388, "Bikash", "CIVIL", 900000), 90);
        employeeMap.put(new Employee(470, "Bimal", "DEFENCE", 500000), 50);
        employeeMap.put(new Employee(624, "Sourav", "CORE", 400000), 40);
        employeeMap.put(new Employee(176, "Prakash", "SOCIAl", 1200000), 120);

        //System.out.println(employeeMap);

        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
                .forEach(System.out::println); // ASC
        System.out.println("-------------------------------------------");
        employeeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
                .forEach(System.out::println); // DESC
    }
}

