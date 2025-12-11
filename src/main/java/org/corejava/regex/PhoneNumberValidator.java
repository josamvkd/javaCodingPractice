package org.corejava.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator
{

    private static final String PHONE_NUMBER_REGEX = "^(\\+\\d{1,3}[- ]?)?\\d{9,10}$";

    public static boolean isValidPhoneNumber(String phoneNumber){
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mobile number to validate: ");
        String input = scanner.nextLine();

        if(isValidPhoneNumber(input)){
            System.out.println("Valid phone Number ✅");
        } else {
            System.out.println("Invalid phone number ❌");
        }
    }
}
