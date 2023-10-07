package ua.hillel.lessons.lesson11.constructorExpl;

public class ConstructorA {
    int value;

    public ConstructorA() {
        System.out.println("WithOut params A");
    }

    public ConstructorA(int value) {
        System.out.println("With params A = " + value);
        this.value = value;
    }

    public void sayHello(int value) {
        System.out.println("Hello " + value);
    }
}
