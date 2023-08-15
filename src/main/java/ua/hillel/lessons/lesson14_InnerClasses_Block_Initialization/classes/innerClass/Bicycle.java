package ua.hillel.lessons.lesson14_InnerClasses_Block_Initialization.classes.innerClass;

public class Bicycle {

    private String model;
    private int weight;

    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;

    }

    public void start() {
        System.out.println("Поехали!");
    }

//    public static void static1(){
//        HandleBar handleBar = new HandleBar();
//    }

    protected class HandleBar {

        public static int speed = 10;

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {

            System.out.println("Руль влево");
        }

        public static void staticTurn() {
            System.out.println("void static");
        }
    }

    public class Seat {

        public void up() {

            System.out.println("Сиденье поднято выше!");
        }

        public void down() {

            System.out.println("Сиденье опущено ниже!");
        }

        public void getSeatParam() {

            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Bicycle.this.seatPostDiameter);
        }
    }
}