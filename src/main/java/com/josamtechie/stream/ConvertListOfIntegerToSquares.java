package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;

public class ConvertListOfIntegerToSquares
{
    static void main()
    {
        List<Integer> numbers = Arrays.asList(2, 5, 3, 7);
        numbers
                .stream()
                .map(i -> i * i)
                .forEach(System.out::println);
    }
}
