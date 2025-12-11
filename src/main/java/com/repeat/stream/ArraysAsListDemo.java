package com.repeat.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ArraysAsListDemo
{
    static void main()
    {
        List<Integer> numbers = Arrays.asList(5, 7, 2, 6, 9, 8, 3);


//        for (int i = 0; i < numbers.size(); i++) {
//                System.out.println(numbers.get(i));
//        }
//        System.out.println("*********");

//        for (int n : numbers) {
//                System.out.println(n);
//        }
//        System.out.println("*********");

        //numbers.forEach(n-> System.out.println(n));
        //numbers.forEach(System.out::println);

        //step 1
//        Consumer<Integer> con = new Consumer<Integer>()
//        {
//            @Override
//            public void accept(Integer n)
//            {
//                System.out.println(n);
//            }
//        };
        //Step 2
        //Consumer<Integer> con = n -> System.out.println(n);

        //Step 3

        //numbers.forEach(n -> System.out.println(n));
        // Step4

        numbers.forEach(System.out::println);

        //Using steams()
        System.out.println("*********");
        numbers.stream().forEach(System.out::println);

    }
}
