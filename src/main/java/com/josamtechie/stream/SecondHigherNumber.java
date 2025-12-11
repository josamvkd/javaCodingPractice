package com.josamtechie.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHigherNumber
{
    static void main()
    {
        List<Integer> numbers = Arrays.asList(20, 35, 45, 36, 84, 20, 45, 85, 25, 36, 85, 84, 90, 95);
        Optional<Integer> secondHighestNumber = numbers
                .stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();
        secondHighestNumber.ifPresent(System.out::println);
    }

}
