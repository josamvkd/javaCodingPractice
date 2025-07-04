package lambda.stream.logic;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NthHighestSalaryDemo
{
    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("Jomon", 1000);
        map.put("Anu", 1300);
        map.put("Eiden", 1500);
        map.put("Joby", 1600);
        map.put("Amal", 1200);
        map.put("Jubitha", 1700);
        map.put("Adam", 1400);


        Map.Entry<String, Integer> nthHighestSalary = getNthHighestSalary(1, map);
        //System.out.println(nthHighestSalary);

        Map<String, Integer> map1 = new HashMap<>();
        map1.put("Jomon", 1000);
        map1.put("Anu", 1200);
        map1.put("Eiden", 1300);
        map1.put("Joby", 1200);
        map1.put("Amal", 1200);
        map1.put("Jubitha", 1300);
        map1.put("Adam", 1000);
        map1.put("Ethan", 1400);

        Map.Entry<Integer, List<String>> nthHighestSalaryGeneric = getNthHighestSalaryGeneric(1, map1);
        System.out.println(nthHighestSalaryGeneric);
    }

    public static Map.Entry<String, Integer> getNthHighestSalary(int num, Map<String, Integer> map)
    {
        return map.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toList())
                .get(num);
    }

    public static Map.Entry<Integer, List<String>> getNthHighestSalaryGeneric(int num, Map<String, Integer> map1)
    {
        return map1.entrySet()
                .stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .collect(Collectors.toList()).get(num);
    }
}
