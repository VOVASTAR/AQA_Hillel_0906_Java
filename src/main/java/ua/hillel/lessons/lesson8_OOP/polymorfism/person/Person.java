package ua.hillel.lessons.lesson8_OOP.polymorfism.person;

// класс человека
class Person {

    private String name;

    public String getName() {
        return name;
    }

    public Person(String name) {

        this.name = name;
    }

    public void display() {

        System.out.printf("Person %s \n", name);
    }
}
