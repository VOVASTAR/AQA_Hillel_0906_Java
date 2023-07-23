package ua.hillel.lessons.lesson12;

public class Recursion {
    public static void main(String[] args) {
        int a = factorialRecursion(4);
        System.out.println(a);
    }

    static int factorialRecursion(int x) {
        int result;
        if (x < 1) {
            return 1;
        }
        result = factorialRecursion(x - 2);
        result *= x;
        return result;
    }

}
