package org.corejava;

enum Status{
    InProgress,
    Pending,
    Success,
    Failed
}

public class EnumDemo
{
    public static void main(String[] args)
    {

        //System.out.println(Status.InProgress);
        //System.out.println(Status.Pending);
        //System.out.println(Status.Success);
        //System.out.println(Status.Failed);

        Status[] status = Status.values();
        for(Status sts : status){
            System.out.println(sts+" : "+sts.ordinal());
        }

    }
}
