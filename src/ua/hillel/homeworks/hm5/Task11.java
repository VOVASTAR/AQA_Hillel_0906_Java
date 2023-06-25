package ua.hillel.homeworks.hm5;

public class Task11 {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        String[][] rectangle = new String[3][5];
        for (int i = 0; i < rectangle.length; i++) {
            for (int j = 0; j < rectangle[i].length; j++) {
                rectangle[i][j] = "*";
                if (j == rectangle[i].length - 1) {
                    System.out.print(rectangle[i][j]);
                    break;
                }
                System.out.print(rectangle[i][j] + "r");
            }
            if (i == rectangle.length - 1) break;
            System.out.println();
        }
    }
}