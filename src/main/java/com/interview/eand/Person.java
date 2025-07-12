package com.interview.eand;

import java.util.Date;

// ✅ Steps to Make a Class Immutable
// Declare the class final (to prevent subclassing).
// Make all fields private and final (to prevent changes).
// Don’t provide setters.
// Initialize all fields via constructor only.
// If any field is mutable, do defensive copying:
// In the constructor (store a copy, not the original).
// In the getter (return a copy, not the original).

// ✅ Example: Immutable Class with a Mutable Field
// Let’s say we have a class Person with:
// String name (immutable)
// Date dob (mutable)

public final class Person
{

    private final String name;
    private final Date dob; // Mutable field

    public Person(String name, Date dob)
    {
        this.name = name;
        // Defensive copy of mutable Date
        this.dob = new Date(dob.getTime());
        // this.dob = dob; // don't use
    }

    public String getName()
    {
        return name;
    }

    public Date getDob()
    {
        // Return a defensive copy
        return new Date(dob.getTime());
        //return dob; // don't use
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', dob=" + dob + "}";
    }
}
