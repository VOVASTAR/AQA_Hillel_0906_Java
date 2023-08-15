package ua.selfwork.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorStart {
    public static void main(String[] args) {


        Integer[] array = new Integer[]{64, 42, 73, 41, 32, 52, 16, 24, 57, 42, 74, 55, 36};
        LinkedList<Integer> list = new LinkedList<>();
        Collections.addAll(list, array);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for (Integer it : list) {
            System.out.println(it);
        }
    }
}
