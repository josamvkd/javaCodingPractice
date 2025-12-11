package com.interview.enbd;

@FunctionalInterface
interface DemoFunctionalInterface
{
    void execute(String input);

    default void logInfo(String message)
    {
        System.out.println("INFO: " + message);
    }

    default void logWarning(String message)
    {
        System.out.println("WARNING: " + message);
    }

    static boolean isValid(String input)
    {
        return input != null && !input.trim().isEmpty();
    }

    static String toUpper(String input)
    {
        return input == null ? "" : input.toUpperCase();
    }
}

public class FunctionalInterfaceDemo
{
    public static void main(String[] args)
    {
        DemoFunctionalInterface printer = (input) ->
        {
            if (DemoFunctionalInterface.isValid(input)) {
                System.out.println("Executing: " + DemoFunctionalInterface.toUpper(input));
            }
        };

        printer.execute("jomon Samuel Thomas");
        printer.logInfo("This is an info message.");
        printer.logWarning("This is a warning message.");
    }
}
