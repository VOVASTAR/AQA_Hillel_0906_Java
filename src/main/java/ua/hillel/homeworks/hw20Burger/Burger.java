package ua.hillel.homeworks.hw20Burger;

public class Burger implements Waiter {

    public final int burgerPrice = 50;

    @Override
    public int getStandartPrice() {
        return this.burgerPrice;
    }

    @Override
    public int costAdditionalIngridients() {
        System.out.println("Выбирите доп. ингредиенты для бургера! (1. Соус - 10, 2. Сыр - 20, 3. котлета - 30)");
        String ingridient = scannerString.nextLine().toLowerCase();
        int cost = switch (ingridient) {
            case "1", "соус" -> OptionalIngridients.SOUS.price;
            case "2", "сыр" -> OptionalIngridients.CHEESE.price;
            case "3", "котлета" -> OptionalIngridients.CUTLET.price;
            default -> throw new IllegalStateException("Вы ввели несуществующий ингридиент: " + ingridient);
        };
        return cost;
    }
}
