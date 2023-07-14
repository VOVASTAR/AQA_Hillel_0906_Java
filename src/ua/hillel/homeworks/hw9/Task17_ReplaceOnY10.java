package ua.hillel.homeworks.hw9;

//Написать программу, которая будет заменять все четные элементы массива на Y и выводить результат в консоль!
//Массив от 1 до 10!
public class Task17_ReplaceOnY10 {
    public static void main(String[] args) {
        arrayReplace();
    }

    public static void arrayReplace() {
        int length = 10;
        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = String.valueOf(i + 1);
            if (Integer.parseInt(array[i]) % 2 == 0) {
                array[i] = "Y";
            }
            System.out.print(array[i] + " ");
        }
    }
}
