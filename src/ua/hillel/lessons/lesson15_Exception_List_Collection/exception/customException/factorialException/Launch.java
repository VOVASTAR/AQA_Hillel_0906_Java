package ua.hillel.lessons.lesson15_Exception_List_Collection.exception.customException.factorialException;

public class Launch {
    public static void main(String[] args) throws FactorialException {

        System.out.println(Factorial.getFactorial(-1));
//        try{
//            int result = Factorial.getFactorial(-1);
//            System.out.println(result);
//        }
//        catch(FactorialException ex){
//
//            System.out.println(ex.getMessage());
//            System.out.println(ex.getNumber());
//        }
    }
}
