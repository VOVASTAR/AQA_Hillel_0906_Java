package ua.hillel.homeworks.hm6;

public class Task12TreeOfStar {
    public static void main(String[] args) {
        treeOfStar();
    }

    public static void treeOfStar() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (j >= 4 - i) {
                    System.out.print("* ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
