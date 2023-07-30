package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.enums;

public class Launch {
    public static void main(String[] args) {
        goToMenu(BorderMenu.CONTACTS);
        for (BorderMenu b : BorderMenu.values()) {
            System.out.println(b);
        }
    }

    public static void goToMenu(BorderMenu borderMenu) {
        switch (borderMenu) {
            case MAIN:
                System.out.println("Go to main menu ");
                break;
            case PRODUCTS:
                System.out.println("Go to PRODUCTS menu");
                break;
            case CONTACTS:
                System.out.println("Go to CONTACTS menu");
                break;
        }

    }
}
