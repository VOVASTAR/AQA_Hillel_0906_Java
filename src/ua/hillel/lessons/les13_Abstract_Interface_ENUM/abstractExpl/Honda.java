package ua.hillel.lessons.les13_Abstract_Interface_ENUM.abstractExpl;

public class Honda extends Car {
    @Override
    String maxSpeed() {
        return "200";
    }

    @Override
    void drive() {
        System.out.println("Honda drive");
    }

    @Override
    void brake() {
        System.out.println("Honda brake");
    }

    @Override
    void repair() {

    }
}
