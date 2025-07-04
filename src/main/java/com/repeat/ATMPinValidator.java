package com.repeat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ATMPinValidator
{
    private static final String ATM_PIN_REGEX = "^\\d{4}|\\d{6}$";

    public static boolean isValidPinNumber(String pin)
    {
//        Pattern pattern = Pattern.compile(ATM_PIN_REGEX);
//        Matcher matcher = pattern.matcher(pin);
//        return matcher.matches();
        return pin.matches(ATM_PIN_REGEX);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your PIN number");
        String input = scanner.nextLine();
        if (isValidPinNumber(input)) {
            System.out.println("Valid pin number ✅");
        } else {
            System.out.println("Invalid pin number ❌");
        }
    }
}
