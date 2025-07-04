package org.josamtechie.corejava;

class Book {

    final public void show() {
        System.out.println("In book show is final");
    }

    public void add(int i, int j) {
        System.out.println("Result : " + i + j);
    }
}

class NoteBook extends Book {
    //    java: show() in NoteBook cannot override show() in Book overridden method is final
    //    public void show()
    //    {
    //        System.out.println("In NoteBook show ");
    //    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {

        NoteBook obj = new NoteBook();
        obj.show();
        obj.add(5, 2);
    }
}
