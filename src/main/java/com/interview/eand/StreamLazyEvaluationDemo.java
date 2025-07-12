package com.interview.eand;

import java.util.Arrays;
import java.util.List;

public class StreamLazyEvaluationDemo
{
    public static void main(String[] args)
    {
        List<Integer> values = Arrays.asList(12,20,35,46,55,68,75);

        // Using enhanced for loop - only 2 times the for loop is processing with the array
        int result =0;
        for (int i : values){
            if(i%5==0){ //
                result = i*2;
                break;
            }
        }
        System.out.println(result);

        System.out.println(values.stream()
                .filter(i -> i % 5 == 0) // Lazy evaluation, it will check condition for entire array
                .map(i -> i * 2) // Lazy evaluation, it will check condition for entire array
                .findFirst()// Terminal operator is Eager evaluation
                .orElse(0));


    }
}
