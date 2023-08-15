package ua.hillel.lessons.lesson6;

import java.util.Scanner;

public class QuantityOfWord {
    public static void main(String[] args) {
        countWord();
    }

    public static void countWord() {
        Scanner sentences = new Scanner(System.in);
        System.out.println("Enter your sentences:");
        String sentence = sentences.nextLine().trim();

        int count = 0;
        if (sentence.length() != 0) {
            count++;
        }

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                count++;
            }
        }
        System.out.println("You enter " + count + " words");
    }
}
