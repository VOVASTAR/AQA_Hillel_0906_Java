package ua.hillel.lessons.lesson14_InnerClasses_Block_Initialization.classes.innerClass;

public class Boeing737 {


    private static int maxPassengersCount = 300;
    private int manufactureYear;

    public Boeing737(int manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public int getManufactureYear() {
        return manufactureYear;
    }

    public static class Drawing {
        private int id;

        public Drawing(int id) {
            this.id = id;
        }

        public static int getMaxPassengersCount() {
            return maxPassengersCount;
        }

        public static void main(String[] args) {

            for (int i = 1; i < 6; i++) {

                Boeing737.Drawing drawing = new Boeing737.Drawing(i);
                System.out.println(drawing);
            }
        }

        @Override
        public String toString() {
            return "Drawing{" +
                    "id=" + id +
                    '}';
        }
    }
}


