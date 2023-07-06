package ua.hillel.homeworks.hm5;

public class TaskTreeStar {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        String[][] rectangle = new String[5][9];

        for (int i = 0; i < rectangle.length; i++) {
//            int middle =rectangle[i].length / 2 + 1;
            int index = (rectangle[i].length - (2 * i + 1)) / 2;
            int endIndex = rectangle[i].length - index;
            for (int j = 0; j < rectangle[i].length; j++) {
                if (j >= index && j < endIndex) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
