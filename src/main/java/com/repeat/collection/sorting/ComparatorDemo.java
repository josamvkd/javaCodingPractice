package com.repeat.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ComparatorDemo
{
    static void main()
    {
        Comparator<Integer> comp = (i, j) ->
        {
            if (i % 10 > j % 10)
                return 1;
            else
                return -1;
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(33);
        nums.add(44);
        nums.add(22);
        nums.add(55);
        nums.add(11);

        Collections.sort(nums, comp);
        System.out.println(nums);
    }
}
