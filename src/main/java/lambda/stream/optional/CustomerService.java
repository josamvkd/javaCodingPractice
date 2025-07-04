package lambda.stream.optional;

import java.util.List;

public class CustomerService
{
    public static Customer getCustomerByEmailId(String email){
        List<Customer> customers = CustomerDB.getAll();
        return customers.stream()
                .filter(e ->e.getEmail().equalsIgnoreCase(email))
                .findAny()
                //.get();
                //.orElse(new Customer());
                .orElseThrow(() -> new IllegalArgumentException("No customer registered with this email id"));
    }
    public static void main(String[] args)
    {
        System.out.println(getCustomerByEmailId("jomon@gmail.com"));
    }
}
