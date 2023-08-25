package ua.hillel.homeworks.hw20Burger;

public class Launch {
    public static void main(String[] args) {

        Burger burger = new Burger();

//        System.out.println(burger);
//        burger.takeOrder();
        OrderController orderController = new OrderController();

        orderController.takeOrder(burger);
//        int e = burger.standartPrice + OptionalIngridients.SOUS.price;
//        System.out.println(e);
    }
}
