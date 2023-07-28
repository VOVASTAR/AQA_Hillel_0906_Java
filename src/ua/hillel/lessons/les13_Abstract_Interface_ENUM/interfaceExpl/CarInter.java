package ua.hillel.lessons.les13_Abstract_Interface_ENUM.interfaceExpl;

public interface CarInter {
    void passengerPlaces();
    void pricePerKilometr();
    void getPassenger();
    void passengerPay();

    private void st() {
        System.out.println("2");
    }
//    static void static(){
//        System.out.println("Wf");
//    }

    default void countWheels(){
        System.out.println("4");
    }
}
