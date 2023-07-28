package ua.hillel.lessons.les13_Abstract_Interface_ENUM.abstractExpl;

public abstract class Car {
    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    abstract void repair();

    void countEheels() {
        System.out.println("4");
    }
}
