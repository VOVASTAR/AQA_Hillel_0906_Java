package javaRush;

import java.util.ArrayList;

public class removeIfArrayList {

    public static void main(String[] args) {

        // create an ArrayList which going to
        // contains a list of Numbers
        ArrayList<Integer> Numbers = new ArrayList<Integer>();

        // Add Number to list
        Numbers.add(23);
        Numbers.add(32);
        Numbers.add(45);
        Numbers.add(63);

        Numbers.removeIf(x -> x % 3 == 0);

        for (Integer numb : Numbers){
            System.out.println(numb);
        }

        ArrayList<String> students = new ArrayList<String>();

        // Add Strings to list
        // each string represents student name
        students.add("Ram");
        students.add("Mohan");
        students.add("Sohan");
        students.add("Rabi");
        students.add("Shabbir");

        students.removeIf(x->x.charAt(0)=='S');

        for (String student : students){
            System.out.println(student);
        }
    }
}