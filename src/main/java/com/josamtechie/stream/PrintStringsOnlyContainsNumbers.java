package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;

public class PrintStringsOnlyContainsNumbers
{
    static void main()
    {
        List<String> list = Arrays.asList(
                "abcd",
                "123",
                "",
                "4.56",
                "587abc",
                "4646"
        );

        list.stream()
                .filter(s -> s.matches("\\d+"))
                .forEach(System.out::println);
    }
}
