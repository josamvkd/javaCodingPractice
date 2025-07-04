package org.josamtechie.corejava.exception;

public class ExceptionsDemo
{
    public static void main(String[] args)
    {
        int i = 5;
        int j = 1;
        int result = 0;
        int[] num = new int[5];
        num[0] = 3;
        num[1] = 4;
        num[2] = 6;
        num[3] = 5;
        num[4] = 7;

        String str =null;
        try {
            result = i / j;
            System.out.println(num[1]);
            System.out.println(num[2]);
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!! : " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception!! : " + e);
        } catch (Exception e) {
            System.out.println("Exception!! : " + e);
        }
        System.out.println(result);
        System.out.println("Bye");
    }
}
