package ua.hillel.lessons.lesson8_OOP.polymorfism.dancer;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Dancer dancer = new Dancer("Антон", 18);

        Dancer breakDanceDancer = new BreakDankDancer("Алексей", 19);// восходящее преобразование к базовому типу
        BreakDankDancer breakDanceDancer2 = new BreakDankDancer("Petro", 26);
        BreakDankDancer breakDanceDancer3 = (BreakDankDancer) breakDanceDancer;

        Dancer electricBoogieDancer = new ElectricBoogieDancer("Игорь", 20); // восходящее преобразование к базовому типу

        ((BreakDankDancer) breakDanceDancer).lowBreak("Uxyyyy");

        List<Dancer> discotheque = Arrays.asList(dancer, breakDanceDancer, electricBoogieDancer, breakDanceDancer2);
        for (Dancer d : discotheque) {
            d.dance();// полиморфный вызов метода
        }
    }
}
