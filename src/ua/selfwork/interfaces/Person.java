package ua.selfwork.interfaces;

public class Person implements Info {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + this.name);
    }
}
