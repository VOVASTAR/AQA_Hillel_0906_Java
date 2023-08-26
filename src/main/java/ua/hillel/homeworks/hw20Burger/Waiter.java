package ua.hillel.homeworks.hw20Burger;

import java.util.Scanner;

public interface Waiter {

    Scanner scannerString = new Scanner(System.in);

    int costAdditionalIngridients();

    int getStandartPrice();

    default int orderCost() {

        boolean isOptional = false;
        int orderSum = getStandartPrice() + costAdditionalIngridients();
        int i = 2;
        while (!isOptional) {
            System.out.println("Хотите ли добавить " + i + "-й ингредиент? Введите : Да или Нет");
            ++i;
            String clientChoise = scannerString.nextLine().toLowerCase();
            switch (clientChoise) {
                case "да" -> orderSum += costAdditionalIngridients();
                case "нет" -> isOptional = true;
                default -> throw new IllegalStateException("Вы ввели некорректный ответ (да/нет)" + clientChoise);
            }
        }
        return orderSum;
    }
}
