package com.repeat;

enum Status
{

    Success,
    Failure,
    Pending,
    Running,
    Hold
}

public class EnumDemo
{
    static void main()
    {
        Status status = Status.Running;
        System.out.println("*******************");
        System.out.println(status);
        System.out.println("*******************");
        System.out.println("Order/Position : "+status.ordinal());
        Status statusArr[] = Status.values();
        System.out.println("*******************");
        for (Status stat : statusArr){
            System.out.println(stat+" : "+stat.ordinal());
        }

    }
}
