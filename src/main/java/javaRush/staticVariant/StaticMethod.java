package javaRush.staticVariant;

public class StaticMethod {

    int f;
    String name;
    static String age;

    public void testNonStatic() {
        f = 32;
        name = "f0";
//        testStatic();
        StaticMethod staticMethod3 = new StaticMethod();
        testNonStaticV2();
    }

    public static class nestedStaticClass{

        int g;

        public nestedStaticClass(int g) {
            this.g = g;
        }

        public void nestedMethod(){
            System.out.println("ggggggg");
        }
    }
    public void testNonStaticV2() {
        f = 32;
        name = "f0";
//        testStatic();
        StaticMethod staticMethod3 = new StaticMethod();

    }

    public static void testStatic() {
        StaticMethod staticMethod = new StaticMethod();
        staticMethod.f = 24;
        System.out.println(staticMethod.f);
        staticMethod.testNonStatic();


    }

    public static void main(String[] args) {
        String string = "12.84";

        int a=4,b=3,c=2;

        double doubl = Double.parseDouble(string);
        System.out.println(Math.round(doubl));
//        testStatic();

        StaticMethod staticMethod31 = new StaticMethod();
        staticMethod31.testNonStaticV2();

        System.out.println(staticMethod31.f);

        String s = "Привет";

        System.out.println(s.toUpperCase());
        int i = 6;
        System.out.println(7 == ++i);
        System.out.println(a<b+c);


    }
}


