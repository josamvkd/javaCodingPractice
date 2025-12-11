package com.interview.enbd;

import java.util.Date;

//✅ Why It’s Immutable:

// final class → can’t be subclassed.
// Fields are private and final.
// No setters.
// For mutable field Date, both constructor and getter use defensive copies.

// ❌ Common Pitfall:
// Returning a reference to a mutable field (like Date, List, or Map) without copying it breaks immutability.
public final class ImmutableCustomClass
{
    private final String name;
    private final int age;
    private final Date birthDate; // Mutable field

    public ImmutableCustomClass(String name, int age, Date birthDate)
    {
        this.name = name;
        this.age = age;
        // Defensive copy of mutable Date
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Date getBirthDate()
    {
        // Return a defensive copy
        return new Date(birthDate.getTime());
    }
}
