package com.repeat;

@FunctionalInterface
interface DemoFunctionalInterface
{
    void execute(String input);

    default void logInfo(String message)
    {
        System.out.println("INFO : " + message);
    }

    default void logWarning(String message)
    {
        System.out.println("WARNING : " + message);
    }

    static boolean isValid(String input){
        return input !=null && !input.trim().isEmpty();
    }

    static String toUpper(String input)
    {
        return input.toUpperCase();
    }
}

public class FunctionalInterfaceDemo
{
    static void main()
    {

        DemoFunctionalInterface print = input -> {
            if(DemoFunctionalInterface.isValid(input)){
                System.out.println(DemoFunctionalInterface.toUpper(input));
            }
        };
        print.execute("Hai, jomon samuel thomas");
        print.logInfo("This is a info message!!");
        print.logWarning("This is a warning message!!");
    }
}
