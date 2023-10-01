package ua.hillel.lessons.lesson15_Exception_List_Collection.list;

import java.util.ArrayList;
import java.util.LinkedList;

public class DifferentLinkedArray_Get {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

//        for (int i = 0; i < 20000000; i++) {
        for (int i = 0; i < 20000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

        long start = System.currentTimeMillis();
//        arrayList.get(1500000);
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Time taken for arrayList is " + (end - start) + " ms");
//-----------------------------------------------------------------------------------------------------------------
        start = System.currentTimeMillis();
//        linkedList.listIterator(1500);
//        linkedList.get(1500000);

        for (int i = 0; i < linkedList.size(); i++) {  // Каждый раз начинает с 0-го элемента и бежит по цепочке связи
            linkedList.get(i);
//            linkedList.listIterator(i);
        }
        end = System.currentTimeMillis();
        System.out.println("Time taken for linkedList is " + (end - start) + " ms");
    }
}
