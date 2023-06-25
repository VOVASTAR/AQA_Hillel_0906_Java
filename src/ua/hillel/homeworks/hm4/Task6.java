package ua.hillel.homeworks.hm4;

public class Task6 {
    public static void main(String[] args) {
        decrementStepTen();
    }

    public static void decrementStepTen() {
        int number = 100;
        while (number >= 10) {
            System.out.print(number + " ");
            number -= 10;
        }
    }
}
