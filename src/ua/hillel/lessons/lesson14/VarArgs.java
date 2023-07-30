package ua.hillel.lessons.lesson14;

public class VarArgs {
    public static void main(String[] args) {
        String nameStr = namesHandler("Vova ", "Dima ", "Lesha ", "Kostya ", "Nika ");
        System.out.println(nameStr);
    }

    public static String namesHandler(String... name) {
        String str = null;
        for (String el : name) {
            str += el.toUpperCase();
        }
        return str;
    }
}
