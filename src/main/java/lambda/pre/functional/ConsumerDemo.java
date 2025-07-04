package lambda.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo
{
    public static void main(String[] args)
    {
        Consumer<Integer> consumer = i -> System.out.println("Printing : " + i);
        consumer.accept(100);

        // ForEach method is using consumer functional interface

        List<Integer> list = Arrays.asList(5,2,4,3,6);
        //list.stream().forEach(consumer);
        list.stream().forEach(i -> System.out.println("Print : " + i));
    }
}
