package selfwork.interfaces;

public class Test {

    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
//        animal1.sleep();
//        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();
        Info info1 = new Animal(2);
        Info info2 = new Person("Jack");
        info1.showInfo();
        info2.showInfo();
        putputInfo(info1);
        putputInfo(info2);
        putputInfo(animal1);
        putputInfo(person1);
    }

    public static void putputInfo(Info info) {
        info.showInfo();
    }
}
