package javaRush;

public class ClassVSInterfaceMethods {

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        System.out.println(tiger.getValue());
        System.out.println(tiger.getName());
    }


}

class Cat {
    public String getName() {
        return "Васька";
    }
}

interface HasName {
    default String getName() {
        return "Interface";
    }

    int getWeight();
}

interface HasWeight {
    default int getValue() {
        return 5;
    }

    ;
}

interface HasSize {
    default int getValue() {
        return 3;
    }

    ;
}

class Tiger extends Cat implements HasName, HasSize, HasWeight {
    public int getWeight() {
        return 115;
    }

    @Override
    public int getValue() {
        return HasSize.super.getValue();
    }
}