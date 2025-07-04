package lambda.stream.map_reduce;

public class EmployeeService
{
    public static void main(String[] args)
    {
        //Get all employees whose grade is A
        // Get Salary
        double averageSalary = EmployeeDAO.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .average().getAsDouble();
        System.out.println(averageSalary);

        double totalSalary = EmployeeDAO.getEmployees().stream()
                .filter(employee -> employee.getGrade().equalsIgnoreCase("A"))
                .map(Employee::getSalary)
                .mapToDouble(i -> i)
                .sum();
        System.out.println(totalSalary);

    }
}
