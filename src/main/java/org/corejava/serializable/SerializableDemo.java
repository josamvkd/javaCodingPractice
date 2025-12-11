package org.corejava.serializable;

import java.io.*;

// In Java, both Serializable and Externalizable interfaces are used to enable object serialization—converting
// an object into a byte stream for storage or transmission. However, they differ significantly in how serialization
// is controlled and implemented.

// 🔷 Serializable Interface
// Marker interface (i.e., has no methods).
// Java's default serialization mechanism.
// The JVM handles the process automatically.
// You can customize by implementing writeObject() and readObject() methods.

// ✅ When to Use:
// When you want quick and easy serialization with minimal code.
// You don't need full control over how data is serialized.

class Employee implements Serializable
{
    private String name;
    private int age;

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class SerializableDemo
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Employee emp = new Employee("Jomon", 34);

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        oos.writeObject(emp);
        oos.close();

        //Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("emp.ser"));
        Employee deserializedEmployee = (Employee) ois.readObject();
        System.out.println(deserializedEmployee);
        ois.close();
        System.out.println("Deserialization complete.");

    }
}
