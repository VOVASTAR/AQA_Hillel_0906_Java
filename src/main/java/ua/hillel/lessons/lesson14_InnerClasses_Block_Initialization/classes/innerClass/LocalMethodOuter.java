package ua.hillel.lessons.lesson14_InnerClasses_Block_Initialization.classes.innerClass;

public class LocalMethodOuter {

    void myLocalMethod() {
        int num = 888;

        class MethodInnerClass {
            public void print() {
                System.out.println("This is inner class " + num);
            }
        }
        MethodInnerClass methodInnerClass = new MethodInnerClass();
        methodInnerClass.print();
    }
}
