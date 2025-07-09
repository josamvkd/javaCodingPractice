package com.josamtechie.java11;

import java.util.Arrays;
import java.util.List;

public class CollectionToArray
{
    public static void main(String[] args)
    {
        List<String> list = Arrays.asList("one", "two", "three");
        String[] array = list.toArray(String[]::new);
        System.out.println(Arrays.toString(array));
    }
}
