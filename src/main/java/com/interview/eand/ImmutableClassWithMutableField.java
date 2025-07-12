package com.interview.eand;

import java.util.Date;

public class ImmutableClassWithMutableField
{
    public static void main(String[] args)
    {
        Date date = new Date();
        Person person = new Person("Jomon", date);
        System.out.println("Before change: " + person);

        // Try to change the original Date
        date.setTime(0);
        System.out.println("After external change: " + person);

        // Try to modify via getter
        person.getDob().setTime(0);
        System.out.println("After getter modification: " + person);

    }
}
