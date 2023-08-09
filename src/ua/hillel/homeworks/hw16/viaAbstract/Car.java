package ua.hillel.homeworks.hw16.viaAbstract;

public class Car extends Vehicle {

    private int quantityDoor;

    public Car() {
    }

    public Car(String brand, String model, int year, int quantityDoor) {
        super(brand, model, year);
        this.quantityDoor = quantityDoor;
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
