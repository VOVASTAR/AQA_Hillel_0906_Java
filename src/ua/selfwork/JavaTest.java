package ua.selfwork;

public class JavaTest {
    public static void main(String[] args) {
//        for (int i = 0; i != 3; i+=10) {
//            System.out.println(i);
//        }
        method();
        method(5);
        System.out.println(2 + 2 * 2);
    }

    public static void method() {
        System.out.println("without args");
    }

    public static void method(int a) {
        System.out.println("without args" + a);
    }

}
