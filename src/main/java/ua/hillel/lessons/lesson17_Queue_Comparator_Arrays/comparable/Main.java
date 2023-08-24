package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.comparable;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<CarComparable> carComparableTreeSet = new TreeSet<>();
        carComparableTreeSet.add(new CarComparable("Tesla", 2018));
        carComparableTreeSet.add(new CarComparable("BMW", 2012));
        carComparableTreeSet.add(new CarComparable("Toyota", 2017));
        carComparableTreeSet.add(new CarComparable("Honda", 2008));
        carComparableTreeSet.add(new CarComparable("Lincoln", 2006));

        for (CarComparable car : carComparableTreeSet) {
            System.out.println(car);
        }
    }


}
