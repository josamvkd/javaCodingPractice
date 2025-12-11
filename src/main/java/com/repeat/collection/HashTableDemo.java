package com.repeat.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo
{
    static void main()
    {
        // HashTable is Synchronized
        // Key value cannot be duplicated, Value can be duplicated
        // Key is Set and Value is List - Map is the combination of Set and List
        Map<String, Integer> map = new Hashtable<>();
        map.put("Vishnu", 33);
        map.put("Manish", 31);
        map.put("Jayan", 27);
        map.put("Vimal", 31);
        map.put("Jithin", 36);
        map.put("Vishnu", 34);

        for (String key : map.keySet()){
            System.out.println(key+ " : " +map.get(key));
        }
    }
}
