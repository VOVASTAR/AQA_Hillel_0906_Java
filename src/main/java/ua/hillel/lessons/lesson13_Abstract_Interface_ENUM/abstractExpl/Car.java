package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.abstractExpl;

public abstract class Car {

    abstract String maxSpeed();

    abstract void drive();

    abstract void brake();

    abstract void repair();

    static  void test(){

    }

    void countEheels() {
        System.out.println("4");
    }
}