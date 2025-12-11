package org.corejava.collection.comparator;

public class BabyAgeComparator {
    public static int compareAges(int age1, int age2) {
        if (age1 > age2) return 1;
        else if (age1 < age2) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        int result = compareAges(5, 4);
        System.out.println("Age comparison result: " + result); // Output: 1
    }
}