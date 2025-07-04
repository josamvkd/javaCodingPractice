package org.josamtechie.corejava;

import java.util.Objects;

// All the classed by default extends the Object class. So need to explicitly extends Object method
//class Bookings extends Object {
class Bookings {
    int bookingId;
    String moveName;

//    public String toString() {
//        return bookingId + " : " + moveName;
//    }


    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Bookings bookings))
            return false;
        return bookingId == bookings.bookingId && Objects.equals(moveName, bookings.moveName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookingId, moveName);
    }

    @Override
    public String toString() {
        return "Bookings{" +
                "bookingId=" + bookingId +
                ", moveName='" + moveName + '\'' +
                '}';
    }
}

public class ObjectDemo {
    public static void main(String[] args) {
        Bookings obj1 = new Bookings();
        obj1.bookingId = 1001;
        obj1.moveName = "Hero";
//        System.out.println(obj.toString());// Object by default return toString method of super class that is Object class's
//                                                                       ---------------------------------------------
//        public String toString() {
//            return getClass().getName() + "@" + Integer.toHexString(hashCode()); // toString Inside Object class
//        }
        Bookings obj2 = new Bookings();
        obj2.bookingId = 1001;
        obj2.moveName = "Hero";
        System.out.println(obj1);
        System.out.println(obj2);

        boolean result = obj1.equals(obj2);
        System.out.println(result); // false
    }
}
