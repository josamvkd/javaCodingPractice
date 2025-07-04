package org.josamtechie.corejava;

public class InheritanceDemo {
    public static void main(String[] args) {
        VeryAdvanceCalc obj = new VeryAdvanceCalc();
        int r1 = obj.add(5, 2);
        int r2 = obj.sub(5, 2);
        int r3 = obj.multi(5, 2);
        int r4 = obj.div(5, 2);
        double r5 = obj.power(5, 2);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4 + " : " + r5);
    }
}
