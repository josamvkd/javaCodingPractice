package com.josamtechie.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class FindLongestWordInSentence
{
    static void main()
    {
        String sentence = " The Java Programming Language is  Awesome!  ";

        Optional<String> opt =
                Arrays.stream(sentence.trim()
                        .split("\\s+"))
                        .max(Comparator.comparingInt(String::length));
        opt.ifPresent(System.out::println);
    }
}
