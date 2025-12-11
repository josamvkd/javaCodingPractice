package com.josamtechie.stream;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GetUniqueWordsFromSentence
{
    static void main()
    {
        String sentence =" The dog sat on mat and my dog on mat is cute";
        // Step 1 Split the string into words Array
        String[] words = sentence.split("\\s+");
        System.out.println("-----------------------");
        Arrays.stream(words)
                .collect(Collectors.toSet())
                .forEach(System.out::println);
    }
}
