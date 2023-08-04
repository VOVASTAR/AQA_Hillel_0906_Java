package ua.hillel.lessons.lesson15.exception.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        arrayAdd();
        methodGet();
        methodIndexOf();
        methodSet();
        methodIndexOf();
        methodRemoveByIndex();
        methodIndexOf();
        methodRemoveByObject();
        methodIndexOf();
    }

    static List<String> myArrayList;

    public static void methodIndexOf() {
        System.out.println(myArrayList.indexOf("Alex"));
        System.out.println(myArrayList.indexOf("Oleg"));
    }

    public static void methodRemoveByIndex() {
        myArrayList.remove(1);
    }

    public static void methodRemoveByObject() {
        myArrayList.remove("Alex");
    }

    public static void methodSet() {
        myArrayList.set(1, "Oleg");
        System.out.println(myArrayList.indexOf("Oleg"));
    }

    public static void arrayAdd() {
        myArrayList = new ArrayList<>();
        myArrayList.add("Alex");
        myArrayList.add("Sergey");
        myArrayList.add(1, "Vova");
    }

    public static void methodGet() {
        String e = myArrayList.get(1);
        System.out.println(e);
    }

    public static void syntaxis() {
        List<String> myArrayList = new ArrayList<>();
        List<String> myLinkedList = new LinkedList<>();
    }
}
