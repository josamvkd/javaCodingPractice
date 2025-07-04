package lambda.stream.sort.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListDemo
{
    public static void main(String[] args)
    {
        List<Integer> list = Arrays.asList(8,3,12,4);

        //Collections.sort(list); // ASC
        //Collections.reverse(list); // DESC
        // OR
        //Collections.sort(list.reversed()); // DESC
        //System.out.println(list);

        // Using stream

        //list.stream().sorted().forEach(System.out::println); // ASC
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // DESC
    }
}
