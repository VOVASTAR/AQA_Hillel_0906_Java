package ua.hillel.homeworks.hm6;

import java.util.Scanner;

public class DifferentLenghtOfColumn {
    public static void main(String[] args) {
        solution();
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        int stroka = scanner.nextInt();
        int[][] multiArray = new int[stroka][];

        for (int i = 0; i < stroka; i++) {
            int stolb = scanner.nextInt();
            multiArray[i] = new int[stolb];
        }
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
