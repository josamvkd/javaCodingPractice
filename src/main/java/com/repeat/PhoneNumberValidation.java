package com.repeat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation
{
    private static final String PHONE_NO_REGEX = "^(\\+\\d{1,3}[- ]?)?\\d{9,10}$";

    public static boolean isValidPhoneNumber(String phone)
    {
        Pattern pattern = Pattern.compile(PHONE_NO_REGEX);
        Matcher matcher = pattern.matcher(phone);
        return matcher.matches();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your mobile number");
        String phone = scanner.nextLine();
        if (isValidPhoneNumber(phone)) {
            System.out.println("Phone number is valid ✅");
        } else {
            System.out.println("Phone number is Invalid ❌");
        }
    }
}
