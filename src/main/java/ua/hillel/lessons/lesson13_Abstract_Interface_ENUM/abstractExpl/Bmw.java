package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.abstractExpl;

public class Bmw extends Car {

    @Override
    String maxSpeed() {
        return "300";
    }

    @Override
    void drive() {
        System.out.println("Bmw drive");
    }

    @Override
    void brake() {
        System.out.println("Bmw brake");
    }

    @Override
    void repair() {
    }

}
