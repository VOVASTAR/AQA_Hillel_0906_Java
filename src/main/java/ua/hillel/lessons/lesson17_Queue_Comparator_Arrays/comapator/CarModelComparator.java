package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.comapator;

import java.util.Comparator;

public class CarModelComparator implements Comparator<CarComparator> {

    @Override
    public int compare(CarComparator o1, CarComparator o2) {
        return o1.getModel().compareTo(o2.getModel());
    }
}
