package ua.selfwork;

public class Reverse2DimArray {
    public static void main(String[] args) {
        array();
        reverse(array());
    }

    public static int[][] array() {
        int[][] array = new int[5][5];
        int i = 1;

        for (int[] numI : array) {
            for (int numJ : numI) {
                numJ = i++;
                System.out.print(numJ + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(array[3][3]);
        System.out.println();
        return array;
    }

    public static void reverse(int[][] array) {
        for (int i =0;i< array.length/2;i++){
            for (int j=0;j< array[i].length; j++){
                int t = array[array.length-i-1][array[i].length - j-1];
                array[i][j] = array[array.length-i-1][array[i].length - j-1];
                array[array.length-i-1][array[i].length - j-1] =t;
            }
        }
        System.out.println(array[4][4]);


    }
}
