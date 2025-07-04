package lambda.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilterDemo
{
    public static void main(String[] args)
    {
        List<String> list = new ArrayList<>();
        list.add("Jomon");
        list.add("Anu");
        list.add("Eiden");
        list.add("Joby");
        list.add("Lalachan");
        list.add("Aleyamma");
        // Traditional way of filtering
        // for (String s : list){
        //     if(s.startsWith("A")){
        //         System.out.println(s);
        //     }
        // }

        list.stream().filter(i -> i.startsWith("A")).forEach(i -> System.out.println(i));

        System.out.println("----------");

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Computer");
        map.put(2,"Mobile");
        map.put(3,"Tablet");
        map.put(4,"Mouse");
        map.put(5,"Keyboard");
        map.put(6,"Printer");

        map.entrySet().stream().filter(i ->i.getValue().startsWith("M")).forEach(System.out::println);
        System.out.println("------");
        map.entrySet().stream().filter(i ->i.getKey()%2==0).forEach(System.out::println);

    }
}
