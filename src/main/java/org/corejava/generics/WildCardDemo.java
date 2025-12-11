package org.corejava.generics;

import java.util.ArrayList;
import java.util.List;

// Base class
class WildCat {
    public void speak() {
        System.out.println("WildCat is growling...");
    }
}

// Subclasses
class Lion extends WildCat {
    @Override
    public void speak() {
        System.out.println("Lion roars!");
    }
}

class Cheetah extends WildCat {
    @Override
    public void speak() {
        System.out.println("Cheetah hisses!");
    }
}

public class WildCardDemo {

    // Method using upper-bounded wildcard: accepts WildCat and its subclasses
    public static void makeWildCatSpeak(List<? extends WildCat> cats) {
        for (WildCat cat : cats) {
            cat.speak();
        }
    }

    // Method using lower-bounded wildcard: accepts WildCat and its superclasses
    public static void addWildCat(List<? super WildCat> cats) {
        cats.add(new Lion()); // Adding a Lion is safe
        cats.add(new Cheetah()); // Adding a Cheetah is safe
        System.out.println("Added Lion and Cheetah to the list.");
    }

    // Method using unbounded wildcard
    public static void printAnyList(List<?> list) {
        for (Object item : list) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<Lion> lions = new ArrayList<>();
        lions.add(new Lion());

        List<WildCat> wildCats = new ArrayList<>();
        wildCats.add(new Cheetah());

        // Upper-bounded wildcard
        makeWildCatSpeak(lions);
        makeWildCatSpeak(wildCats);

        // Lower-bounded wildcard
        addWildCat(wildCats);

        // Unbounded wildcard
        printAnyList(wildCats);
    }
}