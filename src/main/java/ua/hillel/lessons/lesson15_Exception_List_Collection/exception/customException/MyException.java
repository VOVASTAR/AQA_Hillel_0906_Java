package ua.hillel.lessons.lesson15_Exception_List_Collection.exception.customException;

public class MyException extends Exception {

    private int detail;

    public MyException(int detail) {
        this.detail = detail;
    }

    public MyException(String message, int detail) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "MyException{" +
                "detail=" + detail +
                '}';
    }
}
