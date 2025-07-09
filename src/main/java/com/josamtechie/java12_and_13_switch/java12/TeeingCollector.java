package com.josamtechie.java12_and_13_switch.java12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TeeingCollector
{
    public static void main(String[] args)
    {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        double result = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.summingDouble(i -> i),
                        Collectors.counting(),
                        (sum, count) -> sum / count));
        System.out.println(result); // 3.0 (average)

    }
}
