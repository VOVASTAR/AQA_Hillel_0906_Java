package ua.hillel.homeworks.hw9;

//Написать программу, которая будет заменять все четные элементы массива на Y и выводить результат в консоль!
//Массив от 1 до 10!
public class Task17_ReplaceOnY {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int length = 10;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = i + 1;
            if (array[i] % 2 == 0) {
                array[i] = (char) 89;
            }
            System.out.println(array[i]);
        }
    }
}
