package com.repeat;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindSecondHighestNumber
{
    static void main()
    {
        List<Integer> numbers = Arrays.asList(80,99,4,59,80,99,85,59,52,85,9);
        Optional<Integer> secondLargestElement = numbers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        secondLargestElement.ifPresent(System.out::println);
    }
}
