package lambda;

interface Calculator
{
    void switchOn();
}

public class CalculatorImpl
{
    public static void main(String[] args)
    {
        //() -> {};

        Calculator calculator = () ->
        {
            System.out.println("Calculator1 is Switched On");
        };
        calculator.switchOn();

        // Optimized code
        Calculator calculator1 = () -> System.out.println("Calculator2 is Switched On");

        calculator1.switchOn();
    }
}
