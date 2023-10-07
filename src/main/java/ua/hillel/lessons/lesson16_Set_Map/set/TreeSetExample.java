package ua.hillel.lessons.lesson16_Set_Map.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> myTreeSet = new TreeSet<>();
        myTreeSet.add("C");
        myTreeSet.add("D");
        myTreeSet.add("Q");
        myTreeSet.add("Q");
        myTreeSet.add("B");
        myTreeSet.add("A");

        for (String i : myTreeSet) {
            System.out.print(i + " ");
        }
    }
}
