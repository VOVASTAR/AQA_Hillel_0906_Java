package ua.hillel.homeworks.hw20Burger;

import java.util.Scanner;

public interface Waiter {

    Scanner scanner = new Scanner(System.in);

    public default int costAdditionalIngridients(String additionalIngridient) {
        int cost = switch (additionalIngridient) {
            case "1", "соус" -> OptionalIngridients.SOUS.price;
            case "2", "сыр" -> OptionalIngridients.CHEESE.price;
            case "3", "котлета" -> OptionalIngridients.CUTLET.price;
            default -> throw new IllegalStateException("Unexpected value: " + additionalIngridient);
        };
        return cost;
    }

    public default int orderCost() {
        System.out.println("Выбирите доп. ингредиенты для бургера! (1. Соус - 10, 2. Сыр - 20, 3. котлета - 30)");
        String ingridient = scanner.nextLine().toLowerCase();
        return costAdditionalIngridients(ingridient);
    }

    int getStandartPrice();
    public default int takeOrder() {

        boolean isOptional = false;
        int orderSum = getStandartPrice() + orderCost();
        int i = 2;
        while (!isOptional) {
            System.out.println("Хотите ли добавить " + i + "-й ингредиент? Да или Нет");
            ++i;
            String clientChoise = scanner.nextLine();
            if (clientChoise.equalsIgnoreCase("да")) {
                orderSum += orderCost();
            } else {
                isOptional = true;
            }
        }
        return orderSum;

    }
}
