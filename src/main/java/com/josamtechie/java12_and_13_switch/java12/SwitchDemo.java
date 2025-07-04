package com.josamtechie.java12_and_13_switch.java12;

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
            case "Mon", "Tue" -> "09:00am";
            case "Wed", "Thu" -> "10:00am";
            default -> "09:30am";
        };
        System.out.println(time);
    }

}
