package ua.hillel.lessons.lessons3;

public class ConditionExample {
    public static void main(String[] args) {
        method2();
    }

    public static void method2() {
        int a = 7;
        int b = 7;

        if (a == b) {
            System.out.println("Numbers is equal");
        } else if (a>6) {
            System.out.println("a greater than b ");
        } else {
            System.out.println("Not equal");
        }
    }
    public static void method() {
        int a = 6;
        int b = 6;

        if (a == b) {
            System.out.println("Numbers is equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
