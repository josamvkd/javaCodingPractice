package com.repeat;

import java.util.*;

//✅ Why It’s Immutable:

// final class → can’t be subclassed.
// Fields are private and final.
// No setters.
// For mutable field Date, both constructor and getter use defensive copies.

// ❌ Common Pitfall:
// Returning a reference to a mutable field (like Date, List, or Map) without copying it breaks immutability.
public final class ImmutableClassDemo
{
    private final String name;
    private final int age;
    private final Date dateOfBirth;
    private final List<String> skills;
    private final Map<String, String> attributes;

    public ImmutableClassDemo(String name, int age, Date dateOfBirth, List<String> skills, Map<String, String> attributes)
    {
        this.name = name;
        this.age = age;
        // Defensive copy of mutable Date
        this.dateOfBirth = new Date(dateOfBirth.getTime());
        // Defensive copy + unmodifiable List
        this.skills = Collections.unmodifiableList(new ArrayList<>(skills));
        // Defensive copy + unmodifiable Map
        this.attributes = Collections.unmodifiableMap(new HashMap<>(attributes));
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public Date getDateOfBirth()
    {
        // Return a defensive copy
        return new Date(dateOfBirth.getTime());
    }

    public List<String> getSkills()
    {
        return skills; // safe because it's unmodifiable
    }

    public Map<String, String> getAttributes() {
        return attributes; // safe (unmodifiable)
    }
}
