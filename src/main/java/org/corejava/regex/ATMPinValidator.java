package org.corejava.regex;

import java.util.Scanner;

public class ATMPinValidator
{
    private static final String ATM_PIN_REGEX = "^\\d{4}|\\d{6}$";

    public static boolean isValidPin(String pin)
    {
//        Pattern pattern = Pattern.compile(ATM_PIN_REGEX);
//        Matcher matcher =pattern.matcher(pin);
//        return matcher.matches();
        return pin.matches(ATM_PIN_REGEX);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your ATM PIN number: ");
        String pin = scanner.nextLine();
        if (isValidPin(pin)) {
            System.out.println("Valid pin number ✅");
        } else {
            System.out.println("Invalid pin number ❌ It must be exactly 4 or 6 digits.");
        }
    }
}
