package ua.hillel.lessons.lesson11;

import ua.hillel.lessons.lesson11.constructorExpl.ConstructorB;

public class Execute {
    public static void main(String[] args) {
        C c = new C();
        c.print();
        new B().print();

        ConstructorB b = new ConstructorB(321);
        b.test();
    }

}
