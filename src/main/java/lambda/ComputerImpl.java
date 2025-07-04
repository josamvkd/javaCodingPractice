package lambda;

interface Computer
{
    void operatingSystem(String os);
}

public class ComputerImpl
{
    public static void main(String[] args)
    {
        Computer computer = (os) -> System.out.println("Operating System is : " + os);
        computer.operatingSystem("Linux");
    }
}
