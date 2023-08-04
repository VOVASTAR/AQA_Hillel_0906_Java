package ua.hillel.lessons.lesson14.classes.anonymousClass;

interface AbleToEat {
    public void eat();

    public void drink();
}

class Animal implements AbleToEat {
    @Override
    public void eat() {
        System.out.println("Eatttttt");
    }

    @Override
    public void drink() {
        System.out.println("Coca-cola");
    }
}

public class Launch {
    public static void main(String[] args) {
        AbleToEat ableToEat = new Animal();
        ableToEat.eat();

        Animal animal = new Animal();
        animal.eat();

        AbleToEat ableToEat1 = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Anonymous able to eat");
            }

            @Override
            public void drink() {
                System.out.println("Sodovaja");
            }
        };
        ableToEat1.drink();
        ableToEat1.eat();

    }
}
