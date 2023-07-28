package ua.hillel.homeworks.hw12;

//Дано : int []a = {1, 2, 3, 4, 5, 6};
//        Написать метод, который будет принимать
//        два параметра:
//            Массив данных
//            Число
//        Метод должен добавлять в конец принимаемого массива число из параметров и возвращать изменённый массив!
//        Без использования метода Arrays.copyOf и подобных!

public class Task19ExtendArray {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        for (int el : arrayExtend(a, 59)) {
            System.out.println(el);
        }
//        System.out.println(Arrays.toString(arrayExtend(a, 55)));
    }

    public static int[] arrayExtend(int[] array, int number) {
        int[] arrayExtend = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            arrayExtend[i] = array[i];
        }
        arrayExtend[array.length] = number;
        return arrayExtend;
    }
}