package ua.hillel.homeworks.hm5;

public class Task10_1 {
    public static void main(String[] args) {
        System.out.println(minOfTwo(7, 3));
    }

    public static int minOfTwo(int number1, int number2) {
        if (number1 > number2) {
            number1 = number2;
        }
        return number1;
    }
}
