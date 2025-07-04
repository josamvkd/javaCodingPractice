package lambda.pre.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo
{
//    @Override
//    public boolean test(Integer i)
//    {
//        if (i % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public static void main(String[] args)
    {
//        Predicate<Integer> predicate = new PredicateDemo();
//        System.out.println(predicate.test(4));

        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(3));

        List<Integer> list = Arrays.asList(5, 2, 4, 3, 6);
        //list.stream().filter(predicate).forEach(i-> System.out.println(i));
        list.stream().filter(i -> i % 2 == 0).forEach(i -> System.out.println(i));
        //list.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

    }
}
