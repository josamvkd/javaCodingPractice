package com.josamtechie.stream;

import java.util.Arrays;
import java.util.Optional;

public class CountNumberOfWordsInSentence
{
    static void main()
    {
        String sentence = "  The Java  programming  language is Awesome!    ";

        long count = Arrays.stream(sentence.trim().split("\\s+")).count();
        System.out.println("The number of words are : " + count);
    }
}
