package org.josamtechie.corejava.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator
{
    // Regular expression for validating an email
    private static final String EMAIL_REGEX ="^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[a-zA-Z]{2,4}+$";
    //private static final String EMAIL_REGEX ="\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b";

    public static boolean isValidEmail(String email){
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email id for validate: ");
        String email = scanner.nextLine();
        if(isValidEmail(email)){
            System.out.println("✅Valid Email Id");
        }else {
            System.out.println("❌Invalid Email Id");
        }
    }
}
