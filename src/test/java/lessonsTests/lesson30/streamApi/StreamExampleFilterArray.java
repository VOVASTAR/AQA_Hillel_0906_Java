package lessonsTests.lesson30.streamApi;

import java.util.Arrays;

public class StreamExampleFilterArray {

    public static void main(String[] args) {
        String[] str = {"one", "two", "two", "three", "four", "five"};

        Arrays.stream(str).filter(x -> x.length() > 3).forEach(System.out::println);
    }
}