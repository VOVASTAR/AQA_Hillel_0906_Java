package ua.hillel.homeworks.hw8;
//    Заполнить массив из 10 элементов случайными целыми числами от 10(включительно) до 20(включительно). Вывести среднее арифметическое.

public class Task15ArrayAverageValue {
    public static void main(String[] args) {
        System.out.println(averageValue());
    }

    public static double averageValue() {
        int sum = 0;
        int length = 10;
        int[] arrayTen = new int[length];
        for (int i = 0; i < arrayTen.length; i++) {
            arrayTen[i] = (int) (Math.random() * 11 + 10);
            sum += arrayTen[i];
        }
        return (double) sum / length;
    }
}
