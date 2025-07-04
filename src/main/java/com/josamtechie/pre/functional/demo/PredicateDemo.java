package com.josamtechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;

/*public class PredicateDemo implements Predicate<Integer> {
    @Override
    public boolean test(Integer i) {
        if(i %2 ==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate = new PredicateDemo();
        System.out.println("Result : "+predicate.test(4));
    }
}*/

public class PredicateDemo{

    public static void main(String[] args) {
        /*Predicate<Integer> predicate = (i) -> {
            if(i %2 ==0) {
                return true;
            }
            else {
                return false;
            }
        };*/
/*        Predicate<Integer> predicate = i -> i %2 == 0;
        System.out.println("Result : "+predicate.test(5));*/
        List<Integer> lists = Arrays.asList(5,4,6,7,1,2);
        lists.stream().filter(i -> i %2 == 0).forEach(i -> System.out.println("Print : "+i));
    }
}
