package selfwork;


import java.util.ArrayList;
import java.util.Objects;

public class OverrideMethodObject {

    public static void main(String[] args) {

        AnimalOver a = new AnimalOver("A", 2);
        AnimalOver b = new AnimalOver("A", 2);
        var list = new ArrayList<String>() {{
            add("Привет");
            add("Как");
            add("Дела");
        }};
        for (String e : list) {
            System.out.println(e);
        }
        System.out.println(a.equals(b));
    }

}

class AnimalOver {
    private String name;
    private int age;

    public AnimalOver(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public boolean equals(Object object) {
//        if (this == object) return true;
//        if (object == null || getClass() != object.getClass()) return false;
//        AnimalOver that = (AnimalOver) object;
//        return age == that.age && Objects.equals(name, that.name);
//    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

}