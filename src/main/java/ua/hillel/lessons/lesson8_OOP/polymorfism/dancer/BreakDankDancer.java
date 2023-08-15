package ua.hillel.lessons.lesson8_OOP.polymorfism.dancer;

public class BreakDankDancer extends Dancer {

    public BreakDankDancer(String name, int age) {
        super(name, age);
    }

    // переопределение метода базового класса
    @Override
    public void dance() {
        System.out.println(toString() + "Я танцую брейк-данс!");
    }

    public void lowBreak() {
        System.out.println("I`m dancing low breakDance");
    }

    public void lowBreak(String name) {
        System.out.println(name + " I`m dancing low breakDance");
    }
}