package ua.hillel.lessons.lesson3;

import java.util.Scanner;

public class ScannerExp {

    public static void main(String[] args) {
        method2();
    }


    public static void method2() {
        System.out.println("Enter any 2 number from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int result = num1 + num2;
        System.out.println("Result " + result);

    }

    public static void method1() {
        System.out.println("Enter any number from 1 to 10");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = num + 100;
        System.out.println("Entre your" + num);
        System.out.println("Result" + result);
    }
}
