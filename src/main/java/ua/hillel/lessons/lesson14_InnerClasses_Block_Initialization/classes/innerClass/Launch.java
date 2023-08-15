package ua.hillel.lessons.lesson14_InnerClasses_Block_Initialization.classes.innerClass;

public class Launch {
    public static void main(String[] args) {
//        Outer outer = new Outer();
//        outer.showInner();
//
//        StaticOuter.InnerStaticClass staticOuter = new StaticOuter.InnerStaticClass();
//        staticOuter.myMethod();
//
//        LocalMethodOuter localMethodOuter = new LocalMethodOuter();
//        localMethodOuter.myLocalMethod();

        Bicycle peugeot = new Bicycle("Peugeot", 120, 40);
        Bicycle.HandleBar handleBar = peugeot.new HandleBar();
        Bicycle.Seat seat = peugeot.new Seat();

        seat.up();
        peugeot.start();
        handleBar.left();
        handleBar.right();

        Bicycle.HandleBar.staticTurn();
        System.out.println(Bicycle.HandleBar.speed);
    }
}
