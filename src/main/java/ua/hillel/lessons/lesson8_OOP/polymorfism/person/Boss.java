package ua.hillel.lessons.lesson8_OOP.polymorfism.person;

//я добавил класс для теста с нисходящим преобразованием
public class Boss extends Person {
    public Boss(String name) {
        super(name);
    }

    public void display() {
        System.out.printf("Boss %s \n", super.getName());
    }

    public void displayBoss() {
        System.out.printf("Only Boss %s displayed\n", super.getName());
    }

}
