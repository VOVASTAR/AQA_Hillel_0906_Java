package ua.hillel.lessons.lesson17_Queue_Comparator_Arrays.comparable;

public class CarComparable implements Comparable<CarComparable> {

    private String model;
    private int year;

    public CarComparable(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(CarComparable o) {
        if (this.year == o.year) {
            return 0;
        } else if (this.year < o.year) {
            return -1;
        } else {
            return 1;
        }
//        return Integer.compare(this.year, o.year); - сокращенная запись верхнего
//        return this.model.compareTo(o.model); - сортировка по строкам
    }


    @Override
    public String toString() {
        return "CarComparable{" +
                "model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
