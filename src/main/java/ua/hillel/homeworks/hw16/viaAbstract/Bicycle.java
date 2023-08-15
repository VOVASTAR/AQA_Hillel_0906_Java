package ua.hillel.homeworks.hw16.viaAbstract;

public class Bicycle extends Vehicle {

    private int quantityPedal;

    public Bicycle() {
    }

    public Bicycle(String brand, String model, int year, int quantityPedal) {
        super(brand, model, year);
        this.quantityPedal = quantityPedal;
    }

    public int getPedal() {
        return quantityPedal;
    }

    @Override
    public void start() {
        System.out.println("Поездка на велосипеде " + getBrand() + " началась. У велосипеда " + getPedal() + " педали.");
    }

    @Override
    public void stop() {
        System.out.println("Поездка на велосипеде " + getBrand() + " завершена.");
    }
}
