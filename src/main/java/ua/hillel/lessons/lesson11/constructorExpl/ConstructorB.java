package ua.hillel.lessons.lesson11.constructorExpl;

public class ConstructorB extends ConstructorA {
    public ConstructorB() {
        super(43);
        System.out.println("WithOut params B");
    }

    public ConstructorB(int value) {
        super(value);
        System.out.println("With params B = " + value);
    }

    public void test() {
        sayHello(super.value);
    }

}

