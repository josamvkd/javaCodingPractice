package lambda.method_reference;

import java.util.function.Consumer;

public class MethodReferenceDemo
{
    public static void main(String[] args)
    {
        EmployeeService service = new EmployeeService();

        // approach 1 - Anonymous implementation
        service.loadEmployeeFromDB().forEach(new Consumer<Employee>()
        {
            @Override
            public void accept(Employee employee)
            {
                System.out.println(employee);
            }
        });
        System.out.println("***********************************************");
        // approach 2 - Using lambda expression
        service.loadEmployeeFromDB()
                .forEach(employee -> System.out.println(employee));
        System.out.println("***********************************************");
        //approach 3 - Using method reference with custom type
        service.loadEmployeeFromDB()
                .forEach(MethodReferenceDemo::print);
        System.out.println("***********************************************");
        //approach 4 - Using method reference with predefined class
        service.loadEmployeeFromDB()
                .forEach(System.out::println);
    }

    public static void print(Employee employee){
        System.out.println(employee);
    }
}
