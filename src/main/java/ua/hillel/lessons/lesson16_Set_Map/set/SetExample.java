package ua.hillel.lessons.lesson16_Set_Map.set;

import java.util.HashSet;

public class SetExample {

    static HashSet<Integer> myHashSet = new HashSet<>();

    public static void main(String[] args) {
        addMethod();
        sizeMethod();
        isEmptyMethod();
        clearMethod();
//        removeMethod();
//        isContainsMethod();
        sizeMethod();
        isEmptyMethod();
    }

    static void isEmptyMethod() {
        System.out.println("Is myHashSet empty: " + myHashSet.isEmpty());
    }

    static void clearMethod() {
        myHashSet.clear();
    }

    static void sizeMethod() {
        System.out.println("Size myHashSet is: " + myHashSet.size());
    }

    static void isContainsMethod() {
        System.out.println("Is myHashSet contains: " + myHashSet.contains(1));
        System.out.println("Is myHashSet contains: " + myHashSet.contains(10));
    }

    static void removeMethod() {
        System.out.println("Before removing");
        for (Integer i : myHashSet) {
            System.out.print(i + " ");
        }
        myHashSet.remove(1);
        System.out.println();
        System.out.println("After removing");
        for (Integer i : myHashSet) {
            System.out.print(i + " ");
        }
    }

    static void addMethod() {
        myHashSet.add(1);
        myHashSet.add(2);
        myHashSet.add(2);
        myHashSet.add(3);
//        for (Integer i : myHashSet) {
//            System.out.println(i);
//        }
    }
}
