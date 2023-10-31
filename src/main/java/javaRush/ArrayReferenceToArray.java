package javaRush;

import java.util.Arrays;

public class ArrayReferenceToArray {

    public static void main(String[] args) {

        int[] A = {1, 2, 3};
        int[] B = {11, 22, 33};
        B = A;
        A[1] = 2;
        B[1] = 2;
        // printRes(A,B);
        A[1] = 5;
        // printRes(A,B);
        A = null;
        printRes(A, B);
    }

    private static void printRes(int[] A, int[] B) {
        System.out.println(A);
        System.out.println(B);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
    }
}
