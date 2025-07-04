package com.repeat;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation
{
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9._%-]+@[a-zA_Z.-]+\\.[a-zA-Z]{2,6}+$";

    public static boolean isValidEmail(String email)
    {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email Id: ");
        String input = scanner.nextLine();
        if(isValidEmail(input)){
            System.out.println("Valid email Id ✅");
        }else{
            System.out.println("Invalid email Id ❌");
        }
    }
}
