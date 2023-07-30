package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.interfaceExpl;

public class Launch {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Bmw bmw = new Bmw();
        TaxiController taxiController = new TaxiController();
        taxiController.aboutTaxiCar(toyota);
        taxiController.aboutTaxiCar(bmw);
        taxiController.repairTaxi(bmw);
    }

}
