package org.josamtechie.corejava.logics;

public class StringRotationExample
{
    public static void main(String[] args)
    {
        String originalString = "decode";
        int rotationCount = 2;

        // Right rotation
        String rightRotation = rotateRight(originalString, rotationCount);
        System.out.println("Right Rotation By " + rotationCount + ": " + rightRotation);

        // Left rotation
        String leftRotation = rotateLeft(originalString, rotationCount);
        System.out.println("Left Rotation By " + rotationCount + ": " + leftRotation);
    }

    public static String rotateRight(String original, int count)
    {
        int len = original.length();
        count = count % len;
        return original.substring(count) + original.substring(0, count);
    }

    public static String rotateLeft(String original, int count)
    {
        int len = original.length();
        count = count % len;
        return original.substring(len - count) + original.substring(0, len - count);
    }
}
