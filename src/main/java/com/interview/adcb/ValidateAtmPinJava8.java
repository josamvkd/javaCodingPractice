package com.interview.adcb;

public class ValidateAtmPinJava8
{
    private static int validatePIN(String atmPin)
    {
        // Return Code	Meaning
        // 0	PIN is valid and has 4 characters
        // 1	PIN is valid and has 6 characters
        // 2	Invalid length
        // 3	Contains non-digit characters
        // 4	Contains repeated digits
        // 5	Consists of a strict ascending or descending sequence
        //------------------------------------------------------------
        // 1. Check length (highest precedence after valid cases)
        if (!(atmPin.length() == 4 || atmPin.length() == 6)) {
            return 2; // Invalid length
        }
        // 2. Check only digits
        if (!atmPin.chars().allMatch(Character::isDigit)) {
            return 3; // non-digit characters
        }
        // 3. Check repeated digits
        long distinctCount = atmPin.chars().distinct().count();
        if (distinctCount != atmPin.length()) {
            return 4; // repeated digits
        }
        // 4. Check strict ascending or descending
        if (isAscending(atmPin) || isDescending(atmPin)) {
            return 5;
        }
        // 5. Valid PIN
        return atmPin.length() == 4 ? 0 : 1;
    }

    private static boolean isDescending(String atmPin)
    {
        for (int i = 1; i < atmPin.length(); i++) {
            if (atmPin.charAt(i) - atmPin.charAt(i - 1) != 1) return false;
        }
        return true;
    }

    private static boolean isAscending(String atmPin)
    {
        for (int i = 1; i < atmPin.length(); i++) {
            if (atmPin.charAt(i) - atmPin.charAt(i - 1) != -1) return false;
        }
        return true;
    }

    static void main()
    {
        System.out.println(validatePIN("1357"));   // 0 (valid 4-digit)
        System.out.println(validatePIN("143586")); // 1 (valid 6-digit)
        System.out.println(validatePIN("1136a"));  // 2 (invalid length)
        System.out.println(validatePIN("1234"));   // 5 (strict ascending)
        System.out.println(validatePIN("9876"));   // 5 (strict descending)
        System.out.println(validatePIN("1235"));   // 0 (valid)

    }


}
