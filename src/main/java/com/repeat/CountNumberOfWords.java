package com.repeat;

import java.util.Arrays;

public class CountNumberOfWords
{
    static void main()
    {
        String sentence = " The Java Programming  language is    Awesome!  ";
        long count = Arrays.stream(sentence.trim().split("\\s+")).count();
        System.out.println(count);
    }
}
