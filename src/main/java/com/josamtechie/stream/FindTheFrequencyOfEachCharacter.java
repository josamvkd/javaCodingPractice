package com.josamtechie.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFrequencyOfEachCharacter
{
    static void main()
    {
        String str ="missisipi";
        Map<Character, Long> map = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Original String : "+str);
        System.out.println("Frequency Of Each Characters : "+map);
    }
}
