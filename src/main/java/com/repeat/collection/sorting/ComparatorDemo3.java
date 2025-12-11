package com.repeat.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo3
{
    public static void main(String[] args) {

        // Sorted based on first digit
        Comparator<Integer> com = (i, j) -> {
            int firstDigitI = getFirstDigit(i);
            int firstDigitJ = getFirstDigit(j);

            return Integer.compare(firstDigitI, firstDigitJ);
        };

        List<Integer> nums = new ArrayList<>();
        nums.add(385);
        nums.add(422);
        nums.add(281);
        nums.add(543);
        nums.add(134);

        Collections.sort(nums, com);
        System.out.println(nums);
    }

    static int getFirstDigit(int num) {
        while (num >= 10)
            num /= 10;
        return num;
    }
}
