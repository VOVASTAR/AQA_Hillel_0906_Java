package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.toString;


public class Person {

    private String name;
    private int age;
    private boolean retried;

    public Person(String name, int age, boolean retried) {
        this.name = name;
        this.age = age;
        this.retried = retried;
    }

    @Override
    public String toString() {
        return "Best{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", retried=" + retried +
                '}';
    }
}