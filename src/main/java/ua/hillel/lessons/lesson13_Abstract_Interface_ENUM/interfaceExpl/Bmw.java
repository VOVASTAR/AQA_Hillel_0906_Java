package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.interfaceExpl;

public class Bmw implements CarInter, Parts {
    @Override
    public void passengerPlaces() {
        System.out.println("2 places ");
    }

    @Override
    public void pricePerKilometr() {
        System.out.println("price per kilometer - 40$_ ");
    }

    @Override
    public void getPassenger() {
        System.out.println("get passenger_ ");
    }

    @Override
    public void passengerPay() {
        System.out.println("passenger pay_");
    }

    @Override
    public void changeParts() {
        System.out.println("Change parts");
    }

    public void countWheels() {
        System.out.println("Wheels are 4");
    }
}
