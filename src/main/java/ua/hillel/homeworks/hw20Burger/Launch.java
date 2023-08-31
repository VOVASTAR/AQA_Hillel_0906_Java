package ua.hillel.homeworks.hw20Burger;

public class Launch {
    public static void main(String[] args) {

        IBurger burger = new Burger();
        OrderController orderController = new OrderController();

        orderController.takeOrder(burger);
    }
}
