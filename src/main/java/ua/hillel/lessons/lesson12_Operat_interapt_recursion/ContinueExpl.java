package ua.hillel.lessons.lesson12_Operat_interapt_recursion;

public class ContinueExpl {
    public static void main(String[] args) {

        outer:
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (j > i) {
                    System.out.print(("\n"));
//                    continue;
                    continue outer;
                }
                System.out.print((" " + (i * j)));
            }
        }
        System.out.print(("\n"));
    }
}
