package lessonsTests.lesson30.streamApi;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExampleFlatMap {

    public static void main(String[] args) {
        Stream<String> exampleStream = Stream.of("one", "two", "three", "four");

        List<String> stringList = Stream.of(List.of("one", "two"), List.of("three", "four"))
                .flatMap(x -> x.stream()).collect(Collectors.toList());

        stringList.forEach(x -> System.out.println(x));
    }
}
