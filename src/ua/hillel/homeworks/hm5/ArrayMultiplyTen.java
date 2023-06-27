package ua.hillel.homeworks.hm5;

public class ArrayMultiplyTen {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int[][] mylty = new int[10][10];

        for (int i = 0; i < mylty.length; i++) {
            for (int j = 0; j < mylty[i].length; j++) {
                mylty[i][j] = (i + 1) * (j + 1);
                System.out.print(mylty[i][j] + " ");
            }
            System.out.println();
        }
    }
}
