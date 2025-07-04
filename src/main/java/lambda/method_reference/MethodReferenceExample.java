package lambda.method_reference;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MethodReferenceExample
{
    public static void main(String[] args)
    {
        EmployeeService service = new EmployeeService();
        // Anonymous
        List<EmployeeDTO> employeeDTOS = service.loadEmployeeFromDB()
                .stream()
                .map(new Function<Employee, EmployeeDTO>()
                {
                    @Override
                    public EmployeeDTO apply(Employee employee)
                    {
                        EmployeeDTO employeeDTO = new EmployeeDTO();
                        employeeDTO.setId(employee.getId());
                        employeeDTO.setName(employee.getName());
                        employeeDTO.setSalary(employee.getSalary());
                        return employeeDTO;
                    }
                }).collect(Collectors.toList());

        System.out.println(employeeDTOS);


        // Using Lambda

        List<EmployeeDTO> employeeDTOS1 = service.loadEmployeeFromDB().stream().map(employee -> {
            EmployeeDTO employeeDTO = new EmployeeDTO();
            employeeDTO.setId(employee.getId());
            employeeDTO.setName(employee.getName());
            employeeDTO.setSalary(employee.getSalary());
            return employeeDTO;
        }).collect(Collectors.toList());
        System.out.println(employeeDTOS1);

        // Using method reference - static method reference
        List<EmployeeDTO> employeeDTOS2 = service.loadEmployeeFromDB()
                .stream()
                .map(EmployeeMapper::convert)
                .collect(Collectors.toList());
        System.out.println(employeeDTOS2);

        // Using method reference - instance method reference
        EmployeeMapper mapper = new EmployeeMapper();
        List<EmployeeDTO> employeeDTOS3 = service.loadEmployeeFromDB()
                .stream()
                .map(mapper::newConvert)
                .collect(Collectors.toList());
        System.out.println(employeeDTOS3);

        System.out.println("=========================");

        List<String> employeeNameList = service.loadEmployeeFromDB()
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(employeeNameList);

        List<Integer> employeeIdList = service.loadEmployeeFromDB()
                .stream()
                .map(Employee::getId)
                .collect(Collectors.toList());
        System.out.println(employeeIdList);
    }


}
