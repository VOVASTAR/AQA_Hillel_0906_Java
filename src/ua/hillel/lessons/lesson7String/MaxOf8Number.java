package ua.hillel.lessons.lesson7String;

public class MaxOf8Number {
    public static void main(String[] args) {

        int[] array = new int[8];
        int a=0;
        for (int i=0;i<8;i++){
            array[i]= (int) (Math.random()*101);
            if(array[i]>a){
                a = array[i];
            }
        }
        System.out.println(a);
    }
}
