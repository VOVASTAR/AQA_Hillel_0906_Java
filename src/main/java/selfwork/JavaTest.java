package selfwork;

public class JavaTest {
    public static void main(String[] args) {
//        for (int i = 0; i != 3; i+=10) {
//            System.out.println(i);
//        }
        method();
        method(5);
        System.out.println(2 + 2 * 2);

        String s1 = "a1";
        String s2 = "A" + 1;
        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        String s = "hello";
        s = s.concat("world");
        System.out.println(s);
    }

    public static void method() {
        System.out.println("without args");
    }

    public static void method(int a) {
        System.out.println("without args" + a);
    }

}
