package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.enums;

public class LaunchEnumWithConstructor {
    public static void main(String[] args) {
        for (EnumWithContructor country : EnumWithContructor.values()) {
            if (country.currency == null)
                System.out.println(country);
            else
                System.out.println(country + ", " + country.currency);
        }
    }
}
