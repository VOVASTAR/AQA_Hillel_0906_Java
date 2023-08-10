package ua.hillel.homeworks.hw16.viaAbstract;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int manufacturedYear;

    public Vehicle() {
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.manufacturedYear = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return manufacturedYear;
    }

    public abstract void start();

    public abstract void stop();
}
