package ua.hillel.homeworks.hw20Burger;

public class Burger implements Waiter {
    public static final int STANDARTPRICE = 50;

    @Override
    public String toString() {
        return "Burger{" +
                "standartPrice=" + STANDARTPRICE +
                '}';
    }

    @Override
    public int getStandartPrice() {
        return STANDARTPRICE;
    }
}
