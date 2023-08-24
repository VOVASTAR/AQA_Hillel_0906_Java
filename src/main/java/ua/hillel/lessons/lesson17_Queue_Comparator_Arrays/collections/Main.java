package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        collectionsFrequency();
    }


    static void collectionsFrequency() {
        List<Integer> names = Arrays.asList(1, 2, 3, 6, 4, 5, 6, 7, 6);
        System.out.println("Number of frequency elements 6 in collection = " + Collections.frequency(names, 6));
    }

    static void collectionsMaxMin() {
        List<Integer> names = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("Max element of collection " + Collections.max(names));
        System.out.println("Min element of collection " + Collections.min(names));
    }

    static void collectionsShuffle() {
        List<String> names = Arrays.asList("Jeka", "Alex", "Oleg", "Serega");
        Collections.shuffle(names);
        System.out.println("перемешанный  список " + names);
    }

    static void collectionsSort() {
        List<String> names = Arrays.asList("Jeka", "Alex", "Oleg", "Serega");
        System.out.println("Не сортированный список " + names);
        Collections.sort(names);
        System.out.println("сортированный список " + names);
        names.sort(Collections.reverseOrder());
        System.out.println("reverse список " + names);
    }
}
