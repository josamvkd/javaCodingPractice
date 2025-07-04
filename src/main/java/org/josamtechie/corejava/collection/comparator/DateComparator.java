package org.josamtechie.corejava.collection.comparator;

import java.time.LocalDate;

public class DateComparator {
    public static int compareDates(LocalDate d1, LocalDate d2) {
        if (d1.isAfter(d2)) {
            return 1;
        } else if (d1.isBefore(d2)) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 6, 15);
        LocalDate date2 = LocalDate.of(2025, 1, 1);

        System.out.println("Comparison result: " + compareDates(date1, date2));
    }
}

