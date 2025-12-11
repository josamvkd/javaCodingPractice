package com.josamtechie.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordInAString
{
    static void main()
    {
        String sentence = " All the  power  is  with you  ";
        String result = Arrays.stream(sentence.trim().split("\\s+"))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(result);
    }
}
