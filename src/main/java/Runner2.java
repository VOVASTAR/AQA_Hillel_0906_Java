import java.io.FileReader;
import java.io.InputStream;
import java.util.HashMap;

public class Runner2 {
    public static void ref() {
        Duck mcDuck = new Duck("McDuck");
        Duck mcDuck1 = new Duck("McDuck");
        System.out.println(mcDuck == mcDuck1);
        System.out.println(mcDuck.equals(mcDuck1));

        HashMap<Duck, Goose> map = new HashMap<>();
        map.put(new Duck("McDuck"), new Goose("McDuck"));
        Goose goose = map.get(new Duck("McDuck"));
        System.out.println(goose);
    }

    public static void main(String[] args) {
        ref();
    }
}

class Duck {
    String name;

    Duck(String name) {
        this.name = name;
    }

    void swim() {
        System.out.println("Swim like a duck");
    }

    void quack() {
        System.out.println("Quack like a duck");
    }

    void walk() {
        System.out.println("Walk like a duck");
    }

    @Override
    public boolean equals(Object o) {
        return name.equals(((Duck) o).name);
    }


}

class Goose {
    String name;

    Goose(String name) {
        this.name = name;
    }

    void swim() {
        System.out.println("Swim like a duck");
    }

    void quack() {
        System.out.println("Quack like a duck");
    }

    void walk() {
        System.out.println("Walk like a duck");
    }

    @Override
    public boolean equals(Object o) {
        return name.equals(((Goose) o).name);
    }
}

