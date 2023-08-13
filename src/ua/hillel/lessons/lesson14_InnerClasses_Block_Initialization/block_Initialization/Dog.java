package ua.hillel.lessons.lesson14_InnerClasses_Block_Initialization.block_Initialization;

public class Dog {

    private static String lastName;

    static {
        System.out.println("static block");
        lastName = "Rexovich";
    }

    private String name;
    private String breed;
    private int age;

    {
        System.out.println("non-static");
        name = "Rex";
        breed = "Pydel";
        age = 10;
    }

    public Dog() {
    }

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public static String getLastName() {
        return lastName;
    }
}
