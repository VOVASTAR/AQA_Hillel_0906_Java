package ua.hillel.homeworks.hw20Burger;

public class OrderController {

    public void takeOrder(Waiter order) {
        System.out.println(order.orderCost());
    }
}
