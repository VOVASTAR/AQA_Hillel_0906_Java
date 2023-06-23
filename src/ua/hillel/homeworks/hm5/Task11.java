package ua.hillel.homeworks.hm5;

public class Task11 {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        String[][] rectangle = new String[3][5];

        for (int i = 0; i < rectangle.length; i++) {

            for (int j = 0; j < rectangle[i].length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
