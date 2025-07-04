package lambda.stream.map_reduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MapReduceExample
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(3,7,8,1,5,9);

        //Traditional approach
        int sum =0;
        for (int num :numbers){
            sum =sum+num;
        }
        System.out.println(sum);

        int sum1 = numbers.stream().mapToInt(i ->i).sum();
        System.out.println(sum1);
        int sum2 = numbers.stream().reduce(0, ((a, b) -> a + b));
        System.out.println(sum2);

        Optional<Integer> reduceSumWithMethodRef = numbers.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodRef.get());

        int reduceMultiply = numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println(reduceMultiply);

        int reduceSub = numbers.stream().reduce(0, (a, b) -> a - b);
        System.out.println(reduceSub);

        int reduceMax = numbers.stream().reduce(0, (a, b) -> a > b ? a : b);
        System.out.println(reduceMax);

        int reduceMax1 = numbers.stream().reduce(Integer::max).get();
        System.out.println(reduceMax1);

        int reduceMin = numbers.stream().reduce(1, (a, b) -> a < b ? a : b);
        System.out.println(reduceMin);

        int reduceMin1 = numbers.stream().reduce(Integer::min).get();
        System.out.println(reduceMin1);

        List<String> words = Arrays.asList("CoreJava","SpringBoot","Hibernate","Webservice");

        String logestString= words.stream()
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .get();
        System.out.println(logestString);
    }
}
