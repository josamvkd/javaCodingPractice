package com.josamtechie.stream.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Dubai");
        list.add("Sharjah");
        list.add("Abudhabi");
        list.add("Fujairah");
        list.add("Ras Al Khaima");
        list.add("Um Al Quin");


        /*for (String s : list){
            System.out.println(s);
        }*/

        //list.stream().forEach(i -> System.out.println(i));

        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Hyundai");
        map.put(201, "Toyota");
        map.put(403, "Nissan");
        map.put(302, "Mazda");
        map.put(505, "Kia");

        //map.forEach((key,value) -> System.out.println(key + " : "+value));

        map.entrySet().stream().forEach( i -> System.out.println(i));
    }
}
