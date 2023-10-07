package ua.hillel.lessons.lesson14_InnerClasses_Block_Initialization.classes.innerClass;

public class StaticOuter {
    int num;

    static class InnerStaticClass {
        public void myMethod() {
            System.out.println("This is STATIC inner class");
        }
    }
}