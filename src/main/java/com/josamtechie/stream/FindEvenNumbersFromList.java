package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;

public class FindEvenNumbersFromList
{
    static void main()
    {
        List<Integer> numbers = Arrays.asList(5, 6, 3, 2, 7);
        numbers.stream().filter(i -> i % 2 == 0).forEach(System.out::println);

    }
}
