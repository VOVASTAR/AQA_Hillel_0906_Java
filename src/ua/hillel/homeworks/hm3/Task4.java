package ua.hillel.homeworks.hm3;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        inputNumber();
    }

    public static void inputNumber() {
        System.out.println("Введите число на выбор: 1, 2 или 3");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 1 || number == 2 || number == 3) {
            System.out.println("Вы ввели число равное " + number);
        } else {
            System.out.println("Вы ввели число не равное 1, 2 или 3");
        }
    }
}
