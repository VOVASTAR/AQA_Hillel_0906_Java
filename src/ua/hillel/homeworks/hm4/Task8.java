package ua.hillel.homeworks.hm4;

public class Task8 {
    public static void main(String[] args) {
        numberMultiplyTwo();
    }

    public static void numberMultiplyTwo() {
        int number = 1;
        while (number <= 512) {
            System.out.print(number + " ");
            number *= 2;
        }
    }
}
