package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FindSlidingWindowAverage
{
    static void main()
    {
        List<Integer> input = Arrays.asList(4, 8, 15, 16, 23, 42);
        // Output : [9.0, 13.0, 18.0, 27.0]
        int window = 3;
        List<Double> list = IntStream.range(0, (input.size() - (window - 1)))
                .mapToObj(i -> input.subList(i, i + window))
                .map(w -> w.stream()
                        .mapToInt(Integer::intValue)
                        .average()
                        .orElse(0.0)).toList();
        System.out.println(list);
    }
}
