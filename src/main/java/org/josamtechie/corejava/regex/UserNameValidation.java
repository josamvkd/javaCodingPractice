package org.josamtechie.corejava.regex;

import java.util.Scanner;

public class UserNameValidation
{
    private static final String USER_NAME_REGEX = "^[a-zA-Z0-9_]{5,15}$";

    public static boolean isValidUserName(String username)
    {
//        Pattern pattern = Pattern.compile(USER_NAME_REGEX);
//        Matcher matcher = pattern.matcher(username);
//        return matcher.matches();
        return username.matches(USER_NAME_REGEX);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your user name to validate : ");
        String input = scanner.nextLine();
        if (isValidUserName(input)) {
            System.out.println("Valid Username ✅");
        } else {
            System.out.println("Username is not valid ❌");
        }
    }
}
