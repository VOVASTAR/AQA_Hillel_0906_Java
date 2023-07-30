package ua.hillel.lessons.lesson14.block_Initialization;

public class Launch {
    public static void main(String[] args) {
        Dog dog = new Dog("Barsik","Spitz",7);
        System.out.println(dog.getAge());
        Dog dog2 = new Dog();
        System.out.println(dog2.getAge());
        System.out.println(dog2.getBreed());
        System.out.println(dog2.getName());
        System.out.println("-------------------");
        System.out.println(Dog.getLastName());
    }
}
