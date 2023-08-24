package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.comapator;

import java.util.Comparator;

public class CarYearComparator implements Comparator<CarComparator> {

    @Override
    public int compare(CarComparator o1, CarComparator o2) {
        if (o1.getYear() == o2.getYear()) {
            return 0;
        } else if (o1.getYear() > o2.getYear()) {
            return 1;
        } else {
            return -1;
        }
//        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
