package org.josamtechie.corejava.exception;

public class ArrayIndexOutOfBoundExceptionDemo
{
    public static void main(String[] args)
    {
        int[] nums = new int[5];
        nums[0] =3;
        nums[1] =4;
        nums[2] =6;
        nums[3] =5;
        nums[4] =7;

        try{
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        } catch (Exception e){
            System.out.println("Exception Occurred "+e);
        }
        System.out.println("Completed");

    }
}
