package ua.hillel.lessons.lesson15.exception.customException;

public class MyExceptionDemo {

    public static void main(String[] args) {

    }
    static void compnte(int a) throws MyException {
        if (a>10){
            throw new MyException("Some message", a);
        }
        System.out.println();
    }

}