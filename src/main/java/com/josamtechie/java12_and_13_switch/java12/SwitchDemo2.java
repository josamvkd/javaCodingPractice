package com.josamtechie.java12_and_13_switch.java12;

public class SwitchDemo2
{
    public static void main(String[] args)
    {
        String day="Thu";
        String time;
//        switch (day){
//            case "Mon","Tue":
//                time ="08:00am";
//                break;
//            case "Wed","Thu":
//                time ="09:00am";
//                break;
//            default:time="10:00am";
//        }
//        System.out.println(time);

//        time = switch (day){
//            case "Mon","Tue" ->"08:00am";
//            case "Wed","Thu" ->"09:00am";
//            default ->"10:00am";
//        };
//        System.out.println(time);

        time = switch (day){
            case "Mon","Tue" : yield "08:00am";
            case "Wed","Thu" : yield "09:00am";
            default : yield "10:00am";
        };
        System.out.println(time);
    }
}
