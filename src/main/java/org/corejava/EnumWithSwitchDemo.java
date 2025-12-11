package org.corejava;

enum FinalStatus
{
    InProgress,
    Pending,
    Success,
    Failed
}

public class EnumWithSwitchDemo
{
    public static void main(String[] args)
    {
        FinalStatus status = FinalStatus.Failed;

        switch (status) {
            case Pending: {
                System.out.println("Pending");
                break;
            }
            case InProgress: {
                System.out.println("In Progress");
                break;
            }
            case Success: {
                System.out.println("Success");
                break;
            }
            case Failed: {
                System.out.println("Failed");
                break;
            }
            default: {
                System.out.println("Status not available");
            }
        }
    }
}
