package org.corejava.collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapDemo
{
    public static void main(String[] args)
    {
        Map<Integer, String> map = new HashMap<>();
        //Map<Integer, String> map = new Hashtable<>();
        map.put(1001,"Samuel");
        map.put(1002,"Aleyamma");
        map.put(1003,"Jomon");
        map.put(1004,"Anu");
        map.put(1005,"Eiden");
        map.put(1006,"Joby");

        for (Integer key : map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
    }
}
