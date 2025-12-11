package com.repeat;

class Bank
{
    private String manager;
    private String cashier;
    private String clerk;

    public Bank()
    {
        // This type of assignment we commonly used for db connection details
        manager="Jomon";
        cashier="Vishnu";
        clerk="Vinod";
    }

    public String getManager()
    {
        return manager;
    }

    public void setManager(String manager)
    {
        this.manager = manager;
    }

    public String getCashier()
    {
        return cashier;
    }

    public void setCashier(String cashier)
    {
        this.cashier = cashier;
    }

    public String getClerk()
    {
        return clerk;
    }

    public void setClerk(String clerk)
    {
        this.clerk = clerk;
    }
}

public class ConstructorDemoTwo
{
    static void main(String[] args)
    {

        Bank bank = new Bank();
        System.out.println("Manager : "+bank.getManager()+" ~ "+"Cashier : "+bank.getCashier()+" ~ "+"Clerk : "+bank.getClerk());
    }
}
