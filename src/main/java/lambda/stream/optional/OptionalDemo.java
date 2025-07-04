package lambda.stream.optional;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo
{
    public static void main(String[] args)
    {
        Customer customer = new Customer(101, "amal", null, Arrays.asList("7878124545", "8787875254")); // "amal@gmail.com"
        // Three ways to create Optional object
        // 1. empty()
        // 2. of(T value)
        // 3. ofNullable(T value)

        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // of(T value) method will always do the null check
        // When we can go for 'of()' method if we know the object we are passing is a not null ex: customer.getEmail()
        //Optional<String> emailOptional = Optional.of(customer.getEmail());
        //System.out.println(emailOptional);

        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional2);

        // Get Value method
        Optional<String> emailOptional3 = Optional.ofNullable(customer.getEmail());
        //emailOptional3.ifPresent(System.out::println);
        if(emailOptional3.isPresent()){
            System.out.println(emailOptional3.get());
        }
        // Other way
        // 1.
        Optional<String> emailOptional4 = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional4.orElse("default@gmail.com"));
        //2.
        Optional<String> emailOptional5 = Optional.ofNullable(customer.getEmail());
        //System.out.println(emailOptional5.orElseThrow(() -> new IllegalArgumentException("email id is not present")));
        //3.
        Optional<String> emailOptional6 = Optional.ofNullable(customer.getEmail());
        System.out.println(emailOptional6.map(String::toUpperCase).orElseGet(()->"default email.."));

    }
}
