package ua.hillel.lessons.lesson15_Exception_List_Collection.exception;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SimpleExceptionExpl {
    public static void main(String[] args) {
        exceptionExample();
//        structureException();
        exceptionExample2();
        exceptionExample3();
    }
    static void exceptionExample3() {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 6};
        try {
            System.out.println(a[b] / 0);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Unknown happened");
        }
    }
    static void exceptionExample2() {
        System.out.println("Input number");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        int[] a = {3, 4, 6};
        try {
            System.out.println(a[b] / 0);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unknown array index");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("Division by zero");
        }
    }

    static void exceptionExample() {
        try {
            FileWriter fileWriter = new FileWriter("text.txt");
            fileWriter.close();
            fileWriter.write("Hello");
        } catch (IOException u) {
            System.out.println("Open thread");
        }
    }

    static void structureException() {
        try {
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("divide by zero");
        }
    }
}

