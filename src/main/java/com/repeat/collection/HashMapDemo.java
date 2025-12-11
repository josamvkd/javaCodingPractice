package com.repeat.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo
{
    static void main()
    {
        // HashTable is Non Synchronized
        // Key value cannot be duplicated, Value can be duplicated
        // Key is Set and Value is List - Map is the combination of Set and List
        Map<String, Integer> map = new HashMap<>();
        map.put("Vishnu", 33);
        map.put("Manish", 31);
        map.put("Jayan", 27);
        map.put("Vimal", 31);
        map.put("Jithin", 36);
        map.put("Vishnu", 34);

        System.out.println("Value of Key Vimal : "+map.get("Vimal"));

        System.out.println(map);

        for (String key : map.keySet()){
            System.out.println(key+" : "+ map.get(key));
        }
    }
}
