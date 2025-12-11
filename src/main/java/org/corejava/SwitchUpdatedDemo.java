package org.corejava;

public class SwitchUpdatedDemo
{
    public static void main(String[] args)
    {
        System.out.println("---With lambda expression--");
        int day = 5;
        String result = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Unknown day";
        };
        System.out.println(result);

        System.out.println("---With : and yield--");
        int newDay = 3;
        String newResult = switch (newDay) {
            case 1:
                yield "Monday";
            case 2:
                yield "Tuesday";
            case 3:
                yield "Wednesday";
            case 4:
                yield "Thursday";
            case 5:
                yield "Friday";
            case 6:
                yield "Saturday";
            case 7:
                yield "Sunday";
            default:
                yield "Unknown day";
        };
        System.out.println(newResult);
    }
}
