package com.repeat.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingDemo1
{
    static void main()
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(4);
        nums.add(2);
        nums.add(5);
        nums.add(1);

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

    }
}
