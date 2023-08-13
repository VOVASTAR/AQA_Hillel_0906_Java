package ua.hillel.lessons.lesson14_InnerClasses_Block_Initialization.classes.innerClass;

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
