package ua.hillel.homeworks.hw30SortedStream;

import java.util.Arrays;
import java.util.List;

public class SortedStringStream {
    public static void main(String[] args) {

        String eng = "ealgbkjdfvbjkhfdkbljvd";

        List<String> letters = Arrays.stream(eng.split("")).sorted().toList();
        letters.forEach(System.out::print);
    }
}