package ua.hillel.homeworks.hw9;

//Написать программу, которая будет заменять все четные элементы массива на Y и выводить результат в консоль!
//Массив от 1 до 10!
public class Task17_ReplaceOnYChar {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int length = 10;
        char[] array = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '\n'};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 89;
            }
            System.out.print(array[i] + " ");
        }
    }
}
