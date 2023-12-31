package lessonsTests.lesson30.streamApi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamExampleMap {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");


        Set<String> stream = list.stream().map(String::toUpperCase).collect(Collectors.toSet());
        stream.forEach(System.out::println);
    }
}