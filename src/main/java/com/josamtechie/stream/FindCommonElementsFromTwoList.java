package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;

public class FindCommonElementsFromTwoList
{
    static void main()
    {
        List<String> list1 = Arrays.asList("Java", "Servlet", "React", "HTML");
        List<String> list2 = Arrays.asList("Java", "Angular", "HTML", "Spring");

        List<String> list3 = list1
                .stream()
                .filter(list2::contains)
                .toList();
        System.out.println("List1 :"+list1);
        System.out.println("List2 :"+list2);
        System.out.println("CommonElements :"+list3);
    }
}
