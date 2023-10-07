package lessonsTests.lesson30.streamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");

        for (String et : list) {
            System.out.println(et);
        }

        Stream<String> stream = list.stream();
        stream.forEach(System.out::println);
    }
}
