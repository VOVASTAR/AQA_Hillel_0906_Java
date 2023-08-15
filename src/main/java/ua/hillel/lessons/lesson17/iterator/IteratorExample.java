package ua.hillel.lessons.lesson17.iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExample {

    public static void main(String[] args) {

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
            System.out.println(nextInteger);
        }
    }
}
