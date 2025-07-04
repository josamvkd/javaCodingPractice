package org.josamtechie.corejava.regex;

import java.util.Scanner;

public class GenderValidation
{
    private static final String GENDER_REGEX ="(?i)^(male|female|other|prefer not to say)$";
    public static boolean isValidGender(String gender){
        return gender.matches(GENDER_REGEX);
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Gender details for validation : ");
        String input = scanner.nextLine();
        if(isValidGender(input)){
            System.out.println("Gender is : "+input);
        }else{
            System.out.println("Invalid");
        }
    }
}
