package lambda.skip_limit;

import java.util.Arrays;
import java.util.List;

public class SkipLimitDemo
{
    public static void main(String[] args)
    {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        integerList
                .stream()
                .skip(1)
                .limit(7)
                .forEach(System.out::println);

    }
}
