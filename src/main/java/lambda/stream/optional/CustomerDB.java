package lambda.stream.optional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CustomerDB
{
    public static List<Customer> getAll(){
        return Stream.of(
                new Customer(101, "jomon", "jomon@gmail.com", Arrays.asList("4545124545","3656535254")),
                new Customer(102, "anu", "anu@gmail.com", Arrays.asList("1245789632","9898989898")),
                new Customer(103, "eiden", "eiden@gmail.com", Arrays.asList("7878787848","5625252525")),
                new Customer(104, "joby", "joby@gmail.com", Arrays.asList("3262525254","2525252525"))
                ).collect(Collectors.toList());
    }
}
