package org.corejava.serializable.transients;

import java.io.*;

// In Java, the transient keyword is used to indicate that a field should not be serialized when an object
// is converted into a byte stream (typically during serialization with ObjectOutputStream).
// 🔹 Why Use transient?
// Serialization is the process of converting an object into a byte stream so it can be:
// 1. saved to a file,
// 2. sent over a network, or
// 3. persisted in some other form.
//📍By default, all non-static, non-transient fields of a Serializable class are serialized. However,
//  there might be cases where you don't want a field to be serialized, such as:
// 1. Sensitive data (e.g., passwords)
// 2. Large, derived, or redundant data
// 3. Non-serializable objects
// ✅ After deserialization, the transient field will be
// 1. null (for objects),
// 2. 0 (for numbers),
// 3. false (for boolean), or the default value of the type.
class User implements Serializable
{

    String username;
    transient String password; // This will not be serialized

    public User(String username, String password)
    {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User{" + "username='" + username + '\'' + ", password='" + password + '\'' + '}';
    }
}

public class TransientExample
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        User user = new User("Jomon", "secret1234#");

        // Serialize the object
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"));
        oos.writeObject(user);
        oos.close();

        // Deserialization
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"));
        User deserializedUser = (User) ois.readObject();
        ois.close();

        System.out.println("Username: " + deserializedUser.username); // prints: jomon
        System.out.println("Password: " + deserializedUser.password); // prints: null
    }
}
