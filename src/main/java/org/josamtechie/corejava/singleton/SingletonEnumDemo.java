package org.josamtechie.corejava.singleton;

enum ConfigManager
{
    INSTANCE;

    private String config;

    public String getConfig()
    {
        return config;
    }

    public void setConfig(String config)
    {
        this.config = config;
    }
}

public class SingletonEnumDemo
{
    public static void main(String[] args)
    {

        ConfigManager manager = ConfigManager.INSTANCE;
        ConfigManager manager1 = ConfigManager.INSTANCE;
        manager.setConfig("Production");

        System.out.println(manager.getConfig()); // Output: Production Mode
        System.out.println(manager == manager1); // true : same instance
    }
}
