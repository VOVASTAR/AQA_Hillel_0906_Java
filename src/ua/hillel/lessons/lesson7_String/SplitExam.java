package ua.hillel.lessons.lesson7_String;

public class SplitExam {
    public static void main(String[] args) {
        String str = "Hello my name is Vova";
        String[] words = str.split(" ");
        for (String el : words) {
            System.out.println(el);
        }
    }
}
