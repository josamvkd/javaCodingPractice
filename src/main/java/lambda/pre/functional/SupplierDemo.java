package lambda.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo
{
//    @Override
//    public String get()
//    {
//        return "Hello JosamTechie";
//    }

    public static void main(String[] args)
    {
//        Supplier<String> supplier = new SupplierDemo();
//        System.out.println(supplier.get());

        Supplier<String> supplier = () -> "Hello JosamTechie";
        System.out.println(supplier.get());

        //List<String> list = Arrays.asList("A","B","C","D");
        List<String> list = Arrays.asList();
        System.out.println(list.stream().findAny().orElseGet(() -> "Hi JosamTechie"));
    }
}
