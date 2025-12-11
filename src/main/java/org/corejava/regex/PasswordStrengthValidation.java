package org.corejava.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthValidation
{
    //This regex ensures:
    //----------------------
    //1. At least one lowercase letter
    //2. At least one uppercase letter
    //3. At least one digit
    //4. At least one special character
    //5. Minimum of 8 characters
    private static final String PASSWORD_REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&-_+=!]).{8,}$";

    public static boolean isValidPassword(String password)
    {
        Pattern pattern = Pattern.compile(PASSWORD_REGEX);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a password to validate : ");
        String input = scanner.nextLine();
        if (isValidPassword(input)) {
            System.out.println("Strong password !! ✅");
        } else {
            System.out.println("Weak password ❌ Please enter a strong password");
        }
    }
}
