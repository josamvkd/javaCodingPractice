package org.josamtechie.corejava.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo
{
    public static void main(String[] args)
    {
        List<Integer> numbs = new ArrayList<>();
        numbs.add(52);
        numbs.add(75);
        numbs.add(11);
        numbs.add(43);
        numbs.add(67);
        numbs.add(39);

        Collections.sort(numbs, (i, j) ->
        {
            if (i % 10 > j % 10) {
                return 1;
            } else if (1 % 10 < j % 10){
                return -1;
            }else
                return 0;
        });

        System.out.println(numbs);
    }
}
