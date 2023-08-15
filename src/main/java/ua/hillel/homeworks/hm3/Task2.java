package ua.hillel.homeworks.hm3;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        sum();
    }

    public static void sum() {
        System.out.println("Введите два целых числа");
        Scanner scannerInteger = new Scanner(System.in);
        int number1 = scannerInteger.nextInt();
        int number2 = scannerInteger.nextInt();
        System.out.println("Введите имя");
        Scanner scannerString = new Scanner(System.in);
        String name = scannerString.nextLine();
        int result = number1 + number2;
        System.out.println(name + " " + result);
    }
}
