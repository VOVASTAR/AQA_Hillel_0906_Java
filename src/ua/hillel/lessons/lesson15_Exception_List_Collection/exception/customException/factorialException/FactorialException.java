package ua.hillel.lessons.lesson15_Exception_List_Collection.exception.customException.factorialException;

class FactorialException extends Exception {

    private int number;

    public int getNumber() {
        return number;
    }

    public FactorialException(String message, int num) {

        super(message);
        number = num;
    }
}
