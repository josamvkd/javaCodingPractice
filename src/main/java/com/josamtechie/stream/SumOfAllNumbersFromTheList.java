package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;

public class SumOfAllNumbersFromTheList
{
    static void main()
    {
        List<Integer> numbers = Arrays.asList(2, 1, 3, 4, 5);
        int sum = numbers.stream().mapToInt(i -> i).sum();
        System.out.println("Sum : "+sum);
    }
}
