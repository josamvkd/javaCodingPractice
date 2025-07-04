package com.josamtechie.java12_and_13_switch.java13;

import java.util.Scanner;

public class SwitchDemo
{
    public static void main(String[] args)
    {
        System.out.println("Please Enter the Day!");
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();

        checkTime(day);
    }

    private static void checkTime(String day)
    {
        String time;
        time = switch (day) {
            case "Mon", "Tue":
                yield "09:00am";
            case "Wed", "Thu":
                yield "10:00am";
            default:
                yield "09:30am";
        };
        System.out.println(time);
    }

}
