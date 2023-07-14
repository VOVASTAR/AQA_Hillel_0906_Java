package ua.hillel.lessons.lesson7.stringBuff;

import java.util.Arrays;

public class StringBufferEx {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer("Hello world");

        sb.append(new Integer(2));
        sb.append(true);
        sb.append(Arrays.asList(3, 4, 8, "dsa"));
        sb.append((char) '\n');
        sb.append(";fs ");
        System.out.println(sb);

        stringBufferMethods();
    }

    public static void stringBufferMethods() {
        String numbers = "0123456789";
        StringBuffer sb = new StringBuffer(numbers);
        System.out.println(sb.substring(2));
        System.out.println(sb.substring(2, 6));
        System.out.println(numbers.replace('3', '5'));
    }
}
