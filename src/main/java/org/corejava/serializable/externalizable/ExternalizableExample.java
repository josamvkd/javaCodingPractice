package org.corejava.serializable.externalizable;

import java.io.*;
// 🔹 Externalizable Interface
// Extends Serializable, but provides complete control over serialization.
// You must implement two methods:
// writeExternal(ObjectOutput out)
// readExternal(ObjectInput in)
// You must manually handle what fields are written and read.

// ✅ When to Use:
// When you want complete control over the serialization process.
// For example, to skip sensitive or redundant data, or apply compression or encryption.
class Employee implements Externalizable
{

    private String name;
    private int age;

    // Public no-arg constructor required
    public Employee()
    {
    }

    public Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException
    {
        out.writeObject(name);
        out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException
    {
        name = (String) in.readObject();
        age = in.readInt();
    }

    @Override
    public String toString()
    {
        return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}

public class ExternalizableExample
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Employee employee = new Employee("Anu", 29);

        // Serialize
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("empAnu.ser"));
        oos.writeObject(employee);
        oos.close();

        // Deserialize
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("empAnu.ser"));
        Employee deserializedEmployee = (Employee) ois.readObject();
        System.out.println(deserializedEmployee);
        ois.close();
        System.out.println("Deserialization complete.");
    }
}
