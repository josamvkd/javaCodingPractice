package org.corejava.regex;

import java.util.Scanner;

public class DateValidation
{
    // Format: dd/MM/yyyy
    // Validate format like dd/MM/yyyy or yyyy-MM-dd and check if it's a valid calendar date.

    private static final String DATE_REGEX = "^\\d{2}/\\d{2}/\\d{4}$";
    //private static final String DATE_REGEX1 = "^\\d{4}/\\d{2}/\\d{2}$";

    public static boolean isValidDate(String date)
    {
        return date.matches(DATE_REGEX);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date to validate: ");
        String input = scanner.nextLine();
        if (isValidDate(input)) {
            System.out.println("Valid Date ✅");
        } else {
            System.out.println("Invalid Date ❌");
        }
    }
}
