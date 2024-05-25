import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        clear(list);
        list.add("4");
        System.out.println(list);
    }

     static void clear(List<String> list) {
         list.add("2");
         list = new ArrayList<>();
         list.add("4");
         System.out.println(list);
     }
}
