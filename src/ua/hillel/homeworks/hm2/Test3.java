package ua.hillel.homeworks.hm2;

public class Test3 {
    public static void main(String[] args) {
        int alex = 7;
        int maks = 9;
        ++maks;
        int sum = alex + maks;
        System.out.println(sum);

        Test4 maks4 = new Test4();
        int m4 = --maks4.maks;
        System.out.println(maks4.maks);
        System.out.println(m4);

       maks4.igra(500);
        System.out.println();
    }
}
