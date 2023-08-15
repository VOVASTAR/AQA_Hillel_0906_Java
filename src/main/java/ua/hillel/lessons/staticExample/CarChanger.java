package ua.hillel.lessons.staticExample;

public class CarChanger {
    public static void main(String[] args) {
        int wheelsCount = CarStatic.WHEELS_COUNT;

        CarStatic.myStatic = 20;
        System.out.println(CarStatic.myStatic);

        CarStatic car1 = new CarStatic();
        System.out.println("Static var car1 = " + car1.myStatic);
        car1.nonStatic = 25;
        System.out.println("Non Static var car1 = " + car1.nonStatic);

        CarStatic car2 = new CarStatic();
        System.out.println("Static var car1 = " + car2.myStatic);
        System.out.println("Non Static var car1 = " + car2.nonStatic);
    }
}
