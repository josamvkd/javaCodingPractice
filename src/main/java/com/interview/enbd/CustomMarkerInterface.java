package com.interview.enbd;

// Custom marker interface
interface Auditable {
    // No method
}
// Now, a framework can detect if a class implements Auditable and perform auditing logic.
public class CustomMarkerInterface implements Auditable
{
    private String userName;
}
