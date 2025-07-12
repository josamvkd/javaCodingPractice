package com.interview.eand;

import java.io.Serializable;

// ✅ Marker Interface in Java
// A marker interface is a special type of interface in Java that does not contain any methods or fields.
// It is used to mark or tag a class to indicate that it has a specific property or should be treated in a
// special way by the Java runtime or frameworks.

// In this example, the Serializable interface does not define any methods—it just marks MarkerInterfaceDemo as serializable,
// so Java knows it can be converted to a byte stream using ObjectOutputStream.

//Common Marker Interfaces in Java
// Interface              Purpose
// ------------------------------------------------------------------
// Serializable      -    Marks a class for Java object serialization
// Cloneable         -    Allows use of Object.clone() without CloneNotSupportedException
// Remote            -    Marks a class to be used for remote communication in RMI
// ThreadSafe        -    Can be used to indicate custom thread safety (used by frameworks)
public class MarkerInterfaceDemo implements Serializable
{
    private String name;
    private int id;
}
