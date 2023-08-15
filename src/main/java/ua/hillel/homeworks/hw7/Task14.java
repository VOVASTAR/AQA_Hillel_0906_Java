package ua.hillel.homeworks.hw7;

import java.util.Scanner;

//Метод int getInt() - должен считывать с консоли целое число и возвращать его
//Метод char getOperation() - должен считывать с консоли какое-то значение и возвращать символ с операцией (+, -, * или /)
//Метод int calc(int num1, int num2, char operation) - должен выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
//Метод main() - должен считывать 2 числа (с помощью getInt()), считать операцию (с помощью getOperation(), передать все методу calc() и вывести на экран результат
public class Task14 {

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char symbol = getOperation();
        int result = calc(num1, num2, symbol);
        System.out.println(result);
        System.out.println(calc(num1, num2, symbol));
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer number:");
        int number = scanner.nextInt();
        return number;
    }

    public static char getOperation() {
        Scanner scannerChar = new Scanner(System.in);
        System.out.println("Enter arithmetic symbol (+,-,/,*) :");
        char symbol = scannerChar.nextLine().charAt(0);
        return symbol;
    }

    public static int calc(int num1, int num2, char symbol) {
        int result = switch (symbol) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '/' -> num1 / num2;
            case '*' -> num1 * num2;
            default -> -1;
        };
        return result;
    }

}
