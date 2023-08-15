package ua.hillel.lessons.lesson12_Operat_interapt_recursion;

public class Recursion {
    public static void main(String[] args) {
        int a = factorialRecursion(4);
        System.out.println(a);
    }

    static int factorialRecursion(int x) {
        int result = 0;
        if (x == 1) {
            return 1;
        }
        System.out.println(result);
        result = factorialRecursion(x - 1);
        result *= x;
        return result;
    }

}
