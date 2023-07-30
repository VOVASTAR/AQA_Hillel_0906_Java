package ua.hillel.lessons.lesson14.classes.innerClass;

public class Outer {
    int num;

    void showInner() {
        InnerClass innerClass = new InnerClass();
        innerClass.print();
    }

    private class InnerClass {
        public void print() {
            System.out.println("This is inner class");
        }
    }
}
