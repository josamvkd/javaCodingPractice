package org.corejava;

enum NewStatus
{
    InProgress,
    Pending,
    Success,
    Failed
}

public class EnumWithIfDemo
{
    public static void main(String[] args)
    {
        Status status = Status.Success;

        if(status == Status.InProgress)
            System.out.println("In Progress");
        else if(status == Status.Pending)
            System.out.println("Pending");
        else if(status == Status.Success)
            System.out.println("Success");
        else
            System.out.println("Failed");
    }
}
