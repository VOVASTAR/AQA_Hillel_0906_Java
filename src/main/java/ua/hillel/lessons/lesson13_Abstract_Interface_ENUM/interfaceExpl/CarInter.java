package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.interfaceExpl;

public interface CarInter {

    static void staticSt() {
        System.out.println("Wf");
    }

    void passengerPlaces();

    void pricePerKilometr();

    void getPassenger();

    void passengerPay();

    private void st() {
        System.out.println("2");
    }

    default void countWheels() {
        System.out.println("4");
    }
}
