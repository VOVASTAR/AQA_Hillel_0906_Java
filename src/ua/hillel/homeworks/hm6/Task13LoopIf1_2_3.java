package ua.hillel.homeworks.hm6;

public class Task13LoopIf1_2_3 {
    public static void main(String[] args) {
        lesson();
    }

    public static void lesson() {
        for (int i = 1; i <= 3; i++) {
            if (i <= 2) {
                System.out.println("Это " + i + "-й урок!");
                System.out.println("    Я выполнил все домашние задания " + i + "-го урока.");
            } else {
                System.out.println("Это " + i + "-й урок!");
                System.out.println("    Я не выполнил домашние задания " + i + "-го урока.");
            }
        }
    }
}
