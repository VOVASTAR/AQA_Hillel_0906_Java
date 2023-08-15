package ua.hillel.lessons.lesson11;

public class ThisExample {
    public int num = 10;
    public int num2 = 20;

    public void print() {
        int num = 15;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(this.num2);
    }
}
