package ua.hillel.homeworks.hm6;

public class Task12_1_TreeLyosha {
    public static void main(String[] args) {
        pyramidExample();
    }
    public static void pyramidExample() {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i + 1; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
