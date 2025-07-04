package lambda.exception_handling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionHandlingExample
{
    public static void main(String[] args)
    {
        List<String> stringList = Arrays.asList("44", "22", "55", "11", "abc");
        // List<Integer> integerList = stringList.stream().map(Integer::parseInt).collect(Collectors.toList());
        //List<Integer> integerList = stringList.stream().map(Integer::parseInt).toList();
        //System.out.println(integerList);

        // Approach This is not a recommended way to handle the exception
//        stringList.forEach(s->{
//            try{
//                System.out.println(Integer.parseInt(s));
//            } catch (Exception e) {
//                System.out.println("Exception "+e.getMessage());
//            }
//        });

        // Recommended Approach 2
        stringList.forEach(ExceptionHandlingExample::printList);
    }
    // Recommended Approach 2
    public static void printList(String s)
    {
        try {
            System.out.println(Integer.parseInt(s));
        } catch (Exception e) {
            System.out.println("Exception " + e.getMessage());
        }
    }
}
