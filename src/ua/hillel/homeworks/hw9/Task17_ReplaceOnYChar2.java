package ua.hillel.homeworks.hw9;

//Написать программу, которая будет заменять все четные элементы массива на Y и выводить результат в консоль!
//Массив от 1 до 10!
public class Task17_ReplaceOnYChar2 {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int length = 20;
        char[] array = new char[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = (char) (i + '1');
            if (array[i] % 2 == 0) {
                array[i] = 89;
            }
            System.out.print(array[i] + " ");
        }
    }
}
