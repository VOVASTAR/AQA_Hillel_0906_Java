package ua.hillel.homeworks.hw16.viaInterface;

public class Bicycle implements Vehicle {

    private String brand;
    private String model;
    private int year;
    private int quantityPedal;

    public Bicycle() {
    }

    public Bicycle(String brand, String model, int year, int quantityPedal) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.quantityPedal = quantityPedal;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getQuantityPedal() {
        return quantityPedal;
    }

    @Override
    public void start() {
        System.out.println("Поездка на велосипеде " + getBrand() + " началась. У велосипеда " + getQuantityPedal() + " педали.");
    }

    @Override
    public void stop() {
        System.out.println("Поездка на велосипеде " + getBrand() + " завершена.");
    }

}
