package ua.selfwork;

import java.util.Arrays;
import java.util.Collections;

public class Reverse2DimArray2 {
    public static void main(String[] args) {

        reverse();
    }

    public static void reverse() {

        int[][] array = new int[6][5];
        int lenI = array.length;

        int k = 10;
        for (int i = 0; i < lenI; i++) {
            int lenJ = array[i].length;
            for (int j = 0; j < lenJ; j++) {
                array[i][j] = k++;
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(Arrays.deepToString(array));

        for (int i = 0; i < lenI / 2; i++) {
            int lenJ = array[i].length;
            for (int j = 0; j < lenJ; j++) {
                int t = array[i][j];
                array[i][j] = array[lenI - i - 1][lenJ - j - 1];
                array[lenI - i - 1][lenJ - j - 1] = t;
            }
        }
        System.out.println();
//        Collections.reverse(Arrays.asList(array));

        for (int[] num : array) {
            for (int el : num) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
 /*       Integer[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Collections.reverse(Arrays.asList(array1));

// Вывод реверсированного двумерного массива
        for (Integer[] row : array1) {
            for (Integer element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }*/
    }
}
