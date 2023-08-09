package ua.hillel.homeworks.hw16.viaInterface;

public class Car implements Vehicle {

    private String brand;
    private String model;
    private int year;
    private int quantityDoor;

    public Car() {
    }

    public Car(String brand, String model, int year, int quantityDoor) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.quantityDoor = quantityDoor;
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

    public int getQuantityDoor() {
        return quantityDoor;
    }

    @Override
    public void start() {
        System.out.println("Двигатель автомобиля " + getBrand() + " запущен. У авто " + getQuantityDoor() + " двери!");
    }

    @Override
    public void stop() {
        System.out.println("Двигатель автомобиля " + getBrand() + " остановлен.");
    }
}
