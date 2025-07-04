package org.josamtechie.corejava.collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo
{
    public static void main(String[] args)
    {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(25);
        treeSet.add(11);
        treeSet.add(43);
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(32);

        for (int i: treeSet){
            System.out.println(i); // TreeSet is sorting the element
        }
    }
}
