package ua.hillel.lessons.lesson12;

public class Recursion {
static int factorialRecursion(int x){
    int result;
    result = factorialRecursion(x-1)*x;
    return result;
}

}
