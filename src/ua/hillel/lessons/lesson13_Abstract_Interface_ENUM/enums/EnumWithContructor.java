package ua.hillel.lessons.lesson13_Abstract_Interface_ENUM.enums;

public enum EnumWithContructor {
    CANADA("CAN"),
    POLAND("ZLT"),
    GERMANY("EUR"),
    UKRAINE,
    USA;

    String currency;

    EnumWithContructor() {
    }

    EnumWithContructor(String currency) {
        this.currency = currency;
    }
}
