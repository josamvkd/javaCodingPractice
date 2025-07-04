package org.josamtechie.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(7,4,5,2,6,9);

        // list.stream().forEach(n -> System.out.println(n));
        // list.stream().forEach(System.out::println);
        //list.stream().forEach(System.out::println);

        Stream<Integer> s1 = list.stream();
        Stream<Integer> s2  = s1.filter(n -> n%2 ==0);
        Stream<Integer> s3  = s2.map(n -> n*2);

        //int result = s3.reduce(0,(c,e) ->c+e);
        //int result = s3.reduce(0, Integer::sum);

        int result = list.stream()
                         .filter(n -> n%2 ==0)
                         .map(n -> n*2)
                         .reduce(0,Integer::sum);

        System.out.println(result);
        //s3.forEach(System.out::println);
    }
}
