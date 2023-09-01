package lesson19.testSuits;

import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryClass {

    @Factory()
    @Test
    public Object[] testWithFactory() {
        Object[] objects = new Object[2];
        objects[0] = new FirstClass();
        objects[1] = new SecondClass();
        return objects;
    }
}
