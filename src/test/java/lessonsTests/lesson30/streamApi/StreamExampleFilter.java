package lessonsTests.lesson30.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExampleFilter {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");


        Set<String> stream = list.stream().filter(x -> x.equals("two")).collect(Collectors.toSet());
        stream.forEach(System.out::println);

        System.out.println();

        list.stream().filter(x->x.length()>3).toList().forEach(System.out::println);
    }
}