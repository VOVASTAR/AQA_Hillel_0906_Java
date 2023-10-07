package ua.hillel.lessons.lesson6;

import java.util.Scanner;

public class TaskCountWord {
    public static void main(String[] args) {
        sens();
    }

    public static void sens() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }

        }
        System.out.println("You enter " + count + " words");
    }
}
