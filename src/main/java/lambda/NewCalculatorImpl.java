package lambda;

@FunctionalInterface
interface NewCalculator
{
    int substract(int i, int j);
}

public class NewCalculatorImpl
{
    public static void main(String[] args)
    {
        //NewCalculator calculator = (int i, int j) -> i-j;

        NewCalculator calculator = (int i, int j) -> {
            if (i < j) {
                throw new RuntimeException(i+" is less than "+j);
            } else {
                return i - j;
            }
        };

        System.out.println("Result : "+calculator.substract(6, 4));
    }
}
