package com.josamtechie.java9_collection_factory_methods;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionFactoryMethodsDemo
{
    public static void main(String[] args)
    {
        List<String> list = List.of("One","Two","Three");
        Set<String> set = Set.of("apple","ball","cat");
        Map<String,Integer> map = Map.of("Male", 47, "Female", 48);
        System.out.println("-----------");
        list.forEach(System.out::println);
        System.out.println("-----------");
        set.forEach(System.out::println);
        System.out.println("-----------");
        map.forEach((gender,count)-> System.out.println(gender+" : "+count));
    }
}
