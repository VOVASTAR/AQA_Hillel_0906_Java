package lessonsTests.lesson30.streamApi.self;


import java.util.Arrays;
import java.util.List;

class Log {
    String type;
    int count;
    // конструктор и гетеры опущены

    public Log(String type, int count) {
        this.type = type;
        this.count = count;
    }

    public String getType() {
        return type;
    }

    public int getCount() {
        return count;
    }
}

public class Tproger {


    public static void main(String[] args) {


        List<Log> logs = List.of(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 30),
                new Log("Берёза карликовая", 5));

        logs.stream().map(x -> x.getType()).forEach(System.out::println);

        logs.stream().map(Log::getType).map(x -> x.split(" "))
                .forEach(System.out::println);

        logs.stream().map(Log::getType).map(x -> x.split(" "))
                .flatMap(x -> Arrays.stream(x))
                .forEach(System.out::println);

    }
}
