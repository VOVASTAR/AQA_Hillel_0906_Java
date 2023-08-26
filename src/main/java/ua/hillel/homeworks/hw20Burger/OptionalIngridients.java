package ua.hillel.homeworks.hw20Burger;

public enum OptionalIngridients {

    SOUS(10),
    CHEESE(20),
    CUTLET(30);

    int price;

    OptionalIngridients() {
    }

    OptionalIngridients(int price) {
        this.price = price;
    }
}
