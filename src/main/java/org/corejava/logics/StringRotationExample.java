package org.corejava.logics;

public class StringRotationExample
{
    public static void main(String[] args)
    {
        String originalString = "decode";
        int rotationCount = 2;

        // Left rotation
        String leftRotation = rotateLeft(originalString, rotationCount);
        System.out.println("Left Rotation By " + rotationCount + ": " + leftRotation);

        // Right rotation
        String rightRotation = rotateRight(originalString, rotationCount);
        System.out.println("Right Rotation By " + rotationCount + ": " + rightRotation);
    }

    public static String rotateLeft(String original, int count)
    {
        int len = original.length();
        count = count % len;
        return original.substring(len - count) + original.substring(0, len - count);
    }

    public static String rotateRight(String original, int count)
    {
        int len = original.length();
        count = count % len;
        return original.substring(count) + original.substring(0, count);
    }
}
