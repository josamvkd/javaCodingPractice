package org.josamtechie.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo
{
    public static void main(String[] args)
    {

        List<Integer> list = Arrays.asList(7,5,2,6,9,1,4,3,8);


//        Consumer<Integer> con = new Consumer<Integer>()
//        {
//            @Override
//            public void accept(Integer i)
//            {
//                System.out.println(i);
//            }
//        };

        // Consumer<Integer> con = i -> System.out.println(i);

        list.forEach(i -> System.out.println(i));
        //list.forEach(i -> System.out.println(i));
        //list.forEach(System.out::println);
    }
}
