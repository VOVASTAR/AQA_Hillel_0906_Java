package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.abstractExpl;

public class CarController {

    public void aboutCar(Car car) {
        System.out.println(car.maxSpeed());
        car.drive();
        car.brake();
        car.countEheels();

    }
}
