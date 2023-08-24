package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.deque;

import java.util.Deque;
import java.util.LinkedList;

public class Lifo {

    static Deque<Integer> dequeList = new LinkedList<>();

    public static void main(String[] args) {
        linkedListDequeuePush();
        linkedListDequeuePop();
    }

    static void linkedListDequeuePop() {
        while (!dequeList.isEmpty()) {
            System.out.print(dequeList.poll() + " ");
        }
    }

    static void linkedListDequeuePush() {
        dequeList.push(1);
        dequeList.push(2);
        dequeList.push(3);
        dequeList.push(4);
    }
}
