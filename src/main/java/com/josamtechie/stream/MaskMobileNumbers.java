package com.josamtechie.stream;

import java.util.Arrays;
import java.util.List;

public class MaskMobileNumbers
{
    static void main()
    {
        List<String> mobileNumbers = Arrays.asList(
                "9048253654",
                "9578482436",
                "8951737406",
                "9645053965",
                "7845123654"
        );

        List<String> maskedMobileNumber = mobileNumbers
                .stream()
                .map(s -> "******" + s.substring(s.length() - 4))
                .toList();
        maskedMobileNumber.forEach(System.out::println);

        System.out.println("----------------------------");
        List<String> maskedMobileNumber1 = mobileNumbers
                .stream()
                .map(s -> s.substring(0, 2) + "******" + s.substring(s.length() - 2))
                .toList();
        maskedMobileNumber1.forEach(System.out::println);
    }
}
