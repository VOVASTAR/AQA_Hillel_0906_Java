package ua.hillel.lessons.lesson15_Exception_List_Collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class DifferentLinkedArray_Remove {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 22000000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
        arrayList.remove(10000000);
        long end = System.currentTimeMillis();
        System.out.println("Time taken to remove arrayList element is " + (end - start) + " ms");

        start = System.currentTimeMillis();
//        linkedList.remove(10000000);
//        linkedList.listIterator(10000000).remove();
        end = System.currentTimeMillis();
        System.out.println("Time taken to remove linkedList element is " + (end - start) + " ms");
    }
}
