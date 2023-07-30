package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.abstractExpl;

public class Launch {
    public static void main(String[] args) {
        CarController carController = new CarController();
        Bmw bmw = new Bmw();
        carController.aboutCar(bmw);
        Honda honda = new Honda();
        carController.aboutCar(honda);
    }
}
