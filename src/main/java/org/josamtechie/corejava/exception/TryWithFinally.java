package org.josamtechie.corejava.exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithFinally
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = null;
        try {
            System.out.println("Enter the number : ");
            // InputStreamReader in = new InputStreamReader(System.in);
            // br = new BufferedReader(in);
            br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        } finally {
            assert br != null;
            br.close();
        }
    }
}
