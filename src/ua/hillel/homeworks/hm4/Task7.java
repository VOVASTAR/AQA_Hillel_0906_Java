package ua.hillel.homeworks.hm4;

public class Task7 {
    public static void main(String[] args) {
        incrementStepSeven();
    }

    public static void incrementStepSeven() {
        int number = 7;
        while (number <= 98) {
            System.out.print(number + " ");
            number += 7;
        }
    }
}
