package org.josamtechie.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo
{
    public static void main(String[] args)
    {
        Comparator<Integer> com = new Comparator<Integer>()
        {
            @Override
            public int compare(Integer i, Integer j)
            {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(52);
        nums.add(75);
        nums.add(11);
        nums.add(43);
        nums.add(67);
        nums.add(39);

        Collections.sort(nums, com);
        System.out.println(nums);
    }
}
