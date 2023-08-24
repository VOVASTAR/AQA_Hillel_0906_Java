package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.arrays;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        arraysAsList();
    }

    static void arraysAsList() {
        String[] a = {"Alex", "Oleg", "Serega"};
        List<String> name = Arrays.asList(a);
        System.out.println(name);

        a[0] = "Kostia";
        System.out.println(name);

        name.set(1, "Igor");

        System.out.println(Arrays.toString(a));
    }
}
