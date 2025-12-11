package org.corejava;

enum CellPhone
{
    Apple(4500),
    Samsung(3700),
    Vivo,
    Nokia(1100),
    Nexus(3200);

    private int price;

    CellPhone()
    {
        price = 500;
    }

    CellPhone(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }
}

public class EnumClassDemo
{
    public static void main(String[] args)
    {
        // CellPhone s = CellPhone.Nexus;
        // System.out.println(s+" : "+s.getPrice());
        for (CellPhone cellPhone : CellPhone.values()) {
            System.out.println(cellPhone + " : " + cellPhone.getPrice());
        }
    }
}
