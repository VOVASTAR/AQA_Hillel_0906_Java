package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {
        iteratorFailSafe();
//        iteratorFailFast();
    }

    static void iteratorFailSafe() {
        List<Integer> integerList = new LinkedList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            Integer nextInteger = integerIterator.next();
            if (nextInteger.equals(2)) {
//                integerIterator.remove();
                integerList.add(22);
            }
            System.out.println(nextInteger);
        }
        System.out.println(integerList);
    }

    static void iteratorFailFast() {
        List<Integer> integerList = new LinkedList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()) {
            Integer nextInteger = integerIterator.next();
            if (nextInteger.equals(2)) {
                integerIterator.remove();
//                integerList.remove(2);
            }
            System.out.println(nextInteger);
        }
        System.out.println(integerList);
    }
}
