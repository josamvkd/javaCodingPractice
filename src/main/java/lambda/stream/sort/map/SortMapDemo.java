package lambda.stream.sort.map;

import java.util.*;

public class SortMapDemo
{
    public static void main(String[] args)
    {
        Map<String , Integer> map = new HashMap<>();
        map.put("eight", 8);
        map.put("four", 4);
        map.put("ten", 10);
        map.put("two", 2);

//        List<Map.Entry<String , Integer>> entryList = new ArrayList<>(map.entrySet());
//        Collections.sort(entryList, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));
//
//        for (Map.Entry<String , Integer> entry : entryList){
//            System.out.println(entry.getKey()+" : "+entry.getValue());
//        }

        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println); // Comparing by key - ASC
        System.out.println("///////////////");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println); // Comparing by value - ASC
        System.out.println("///////////////");
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println); // Comparing by key - DESC
        System.out.println("///////////////");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println); // Comparing by value - DESC
    }
}
