package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.comapator;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<CarComparator> carComparableTreeSet = new TreeSet<>(new CarYearComparator());
        carComparableTreeSet.add(new CarComparator("Tesla", 2018));
        carComparableTreeSet.add(new CarComparator("BMW", 2012));
        carComparableTreeSet.add(new CarComparator("Toyota", 2017));
        carComparableTreeSet.add(new CarComparator("Honda", 2008));
        carComparableTreeSet.add(new CarComparator("Lincoln", 2006));

        for (CarComparator car : carComparableTreeSet) {
            System.out.println(car);
        }
    }


}
