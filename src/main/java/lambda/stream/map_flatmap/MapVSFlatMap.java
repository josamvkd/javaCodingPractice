package lambda.stream.map_flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVSFlatMap
{
    public static void main(String[] args)
    {
        List<Customer> customerList = CustomerDAO.getAll();

        // List<Customer> to List<String> -> Data Transformation
        // mapping : customers -> customer.getEmail()
        // customers -> customer.getEmail() One-To-One mapping
        List<String> emailList =
                customerList
                .stream()
                .map(Customer::getEmail)
                .collect(Collectors.toList());
        System.out.println(emailList);

        //customers -> customer.getPhoneNumbers() ->> One-To-Many mapping
        List<List<String>> phoneNumbers =
                customerList
                .stream()
                .map(Customer::getPhoneNumbers)
                .collect(Collectors.toList());
        System.out.println(phoneNumbers);

        // List<Customer> to List<String> -> Data Transformation
        // mapping : customers -> customer.getPhoneNumbers()
        // customers -> customer.getPhoneNumbers() ->> One-To-Many mapping
        List<String> phones =
                 customerList.stream()
                .flatMap(p -> p.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println(phones);
    }
}
