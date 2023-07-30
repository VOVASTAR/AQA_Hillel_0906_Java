package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.interfaceExpl;

public class TaxiController {
    public void aboutTaxiCar(CarInter car) {
        System.out.print("In this car ");
        car.passengerPlaces();
        car.pricePerKilometr();
        car.getPassenger();
        car.passengerPay();
    }

    public void repairTaxi(Parts parts) {
        parts.changeParts();

    }
}