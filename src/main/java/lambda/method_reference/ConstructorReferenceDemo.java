package lambda.method_reference;

public class ConstructorReferenceDemo
{
    public static void main(String[] args)
    {
        EmployeeService service = new EmployeeService();

        //Constructor Reference using Lambda
        EmployeeManager manager = () -> new Employee();
        manager.getEmployees().getEmployeeInfo();

        //Constructor Reference
        EmployeeManager manager1 = Employee::new;
        manager1.getEmployees().getEmployeeInfo();
    }
}
