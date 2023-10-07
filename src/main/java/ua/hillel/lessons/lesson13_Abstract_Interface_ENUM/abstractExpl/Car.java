package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.abstractExpl;

public abstract class Car {

    static void test() {

    }

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    abstract void repair();

    void countEheels() {
        System.out.println("4");
    }
}
