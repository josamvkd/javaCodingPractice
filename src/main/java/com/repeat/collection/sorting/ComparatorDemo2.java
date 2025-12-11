package com.repeat.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2
{
    static void main()
    {
        Comparator<Integer> com = (i, j) -> {
            // if(i%100 >j%100) //sorted based on middle element
            if (i % 10 > j % 10) // Sort based on last element
                return 1;
            else
                return -1;
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(345);
        nums.add(422);
        nums.add(231);
        nums.add(513);
        nums.add(154);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
