package ua.hillel.lessons.lesson8_OOP.polymorfism.dancer;

public class ElectricBoogieDancer extends Dancer {
    public ElectricBoogieDancer(String name, int age) {
        super(name, age);
    }

    // переопределение метода базового класса
    @Override
    public void dance() {
        System.out.println(toString() + "Я танцую электрик буги!");
    }

    private void sing(){

    }

    private void sing(String song){

    }

}
