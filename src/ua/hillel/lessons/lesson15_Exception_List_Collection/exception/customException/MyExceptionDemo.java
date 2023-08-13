package ua.hillel.lessons.lesson15_Exception_List_Collection.exception.customException;

public class MyExceptionDemo {

    public static void main(String[] args) throws MyException {
//        compute(11);
        checkAge(15);
    }

    static void compute(int a) throws MyException {
        if (a > 10) {
            throw new MyException("Some message", a);
        }
        System.out.println();
    }

    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }


}


