package ua.hillel.lessons.lesson12_Operat_interapt_recursion;

public class BreakReturnLoop {
    public static void main(String[] args) {
        outer:
        for (int i = 0; i < 3; i++) {
            System.out.println("This is first loop. I`m making " + i + " times");
            for (int j = 0; j <= 5; j++) {
                System.out.println("This is second loop. I`m making " + j + " times");
                if (j == 2)
                    break outer;
//                    return;
            }
            System.out.println("after return");
        }
        System.out.println("End");
    }
}
