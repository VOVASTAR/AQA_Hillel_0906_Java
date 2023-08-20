package ua.hillel.lessons.lesson16_Set_Map.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    static Map<String, Integer> namesAndAge = new HashMap<>();

    public static void main(String[] args) {
        putMethod();
//        getMethod();
//        removeMethod();
        containsMethod();
        containsMethodValue();
        sizeMethod();
    }

    static void sizeMethod() {
        System.out.println(namesAndAge.size());
    }

    static void containsMethod() {
        System.out.println(namesAndAge.containsKey("Alex"));
        System.out.println(namesAndAge.containsKey("Sveta"));
    }

    static void containsMethodValue() {
        System.out.println(namesAndAge.containsValue(18));
        System.out.println(namesAndAge.containsValue(15));
    }

    static void removeMethod() {
        System.out.println("Before removing");
        for (Map.Entry<String, Integer> e : namesAndAge.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
        namesAndAge.remove("Alex");
        System.out.println("After removing");
        for (Map.Entry<String, Integer> e : namesAndAge.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }

    static void getMethod() {
        System.out.println("Get by key Oleh " + namesAndAge.get("Oleh"));
    }

    static void putMethod() {
        namesAndAge.put("Alex", 34);
        namesAndAge.put("Alex", 37);
        namesAndAge.put("Oleh", 30);
        namesAndAge.put("Kostya", 18);


//        for (Map.Entry<String, Integer> e : namesAndAge.entrySet()) {
//            System.out.println(e.getKey() + " " + e.getValue());
//        }
    }

}
