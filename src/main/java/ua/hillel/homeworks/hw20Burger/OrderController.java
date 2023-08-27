package ua.hillel.homeworks.hw20Burger;

public class OrderController {

    public void takeOrder(IBurger burger) {
        System.out.println(burger.orderCost());
    }
}
