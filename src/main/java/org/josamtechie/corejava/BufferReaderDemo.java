package org.josamtechie.corejava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class  BufferReaderDemo
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Enter the number : ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close();
    }
}
