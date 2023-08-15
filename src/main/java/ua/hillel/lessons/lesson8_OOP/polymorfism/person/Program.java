package ua.hillel.lessons.lesson8_OOP.polymorfism.person;

public class Program{

    public static void main(String[] args) {

        Person tom = new Person("Tom");
        tom.display();
        Person sam = new Employee("Sam", "Oracle");
        sam.display();
        Person bob = new Client("Bob", "DeutscheBank", 3000);
        bob.display();
        System.out.println(bob.getName());
        Person boss = new Boss("Jack");
        Boss boss1 = (Boss) boss;
        boss1.displayBoss();
        boss.display();
        ((Boss)boss).displayBoss();
    }
}
