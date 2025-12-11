package com.repeat.input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputDemo
{
    static void main() throws IOException
    {
        System.out.println("Enter :");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int value = Integer.parseInt(bf.readLine());
        System.out.println(value);
        bf.close();
    }
}
