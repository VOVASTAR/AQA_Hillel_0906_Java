package ua.hillel.lessons.lesson11;

public class C extends B {
    int value = 25;

    @Override
    public void print() {
        System.out.println(super.value);
        System.out.println(this.value);
    }
}
