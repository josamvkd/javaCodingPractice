package com.josamtechie.pre.functional.demo;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//public class ConsumerDemo implements Consumer<Integer>{
public class ConsumerDemo{


    public static void main(String[] args) {
        Consumer<Integer> consumer =  i -> System.out.println("Printing : "+i);
//        consumer.accept(24);

        List<Integer> list = Arrays.asList(3,4,2,1,6);
        list.stream().forEach(i -> System.out.println("Print : "+i));
    }
}
