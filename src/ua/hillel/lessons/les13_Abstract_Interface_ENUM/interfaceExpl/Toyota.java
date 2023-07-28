package ua.hillel.lessons.les13_Abstract_Interface_ENUM.interfaceExpl;

public class Toyota implements CarInter{
    @Override
    public void passengerPlaces() {
        System.out.println("4 places ");
    }

    @Override
    public void pricePerKilometr() {
        System.out.println("price per kilometer - 10$_ ");
    }

    @Override
    public void getPassenger() {
        System.out.println("get passenger_ ");
    }

    @Override
    public void passengerPay() {
        System.out.println("passenger pay_");
    }
}
