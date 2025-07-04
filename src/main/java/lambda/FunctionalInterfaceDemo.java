package lambda;

@FunctionalInterface
interface TestFunctionalInterface{

    // Abstract method - required for functional interface
    public abstract void execute(String input);

    // Default method 1
    default void logInfo(String message) {
        System.out.println("INFO: " + message);
    }
    // Default method 2
    default void logWarning(String message) {
        System.out.println("WARNING: " + message);
    }

    // Static method 1
    static boolean isValid(String input) {
        return input != null && !input.trim().isEmpty();
    }

    // Static method 2
    static String toUpper(String input) {
        return input == null ? "" : input.toUpperCase();
    }
}

public class FunctionalInterfaceDemo
{
    public static void main(String[] args)
    {
        TestFunctionalInterface printer = (input) -> {
            if (TestFunctionalInterface.isValid(input)) {
                System.out.println("Executing: " + TestFunctionalInterface.toUpper(input));
            }
        };

        printer.execute("hello world");
        printer.logInfo("This is an info message.");
        printer.logWarning("This is a warning message.");
    }
}
