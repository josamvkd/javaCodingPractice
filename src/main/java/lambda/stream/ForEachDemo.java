package lambda.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo
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

        // Traditional iteration using enhanced for loop
        /*for(String s : list){
            System.out.println(s);
        }*/

        list.stream().forEach( i-> System.out.println(i));
        //list.stream().forEach(System.out::println);

        Map<Integer, String> map = new HashMap<>();
        map.put(1,"Computer");
        map.put(2,"Mobile");
        map.put(3,"Tablet");
        map.put(4,"Mouse");
        map.put(5,"Keyboard");

        map.forEach((k,v) -> System.out.println(k+" : "+v));
        System.out.println("---------------");
        map.entrySet().forEach(i -> System.out.println(i));
    }
}
