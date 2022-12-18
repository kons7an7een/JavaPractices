package Practice3_WR_1;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Double a = Double.valueOf("2.4565487894123");
        Double b = Double.valueOf(3221.55);
        Double c = Double.valueOf("49999.9999999");
        String num = "1234.56789";
        double num1 = Double.parseDouble(num);
        int num11 = b.intValue();
        byte num111 = b.byteValue();
        short num1111 = b.shortValue();
        long num11111 = b.longValue();
        float num111111 = b.floatValue();
        String d = Double.toString(3.14);
        System.out.println("Результат выполнения №1:\n" + a);
        System.out.println(b);
        System.out.println(c);
        System.out.println("Результат выполнения №2:\n" + num1);
        System.out.println("Результат выполнения №3 (на основе объекта b):\n" + num11);
        System.out.println(num111);
        System.out.println(num1111);
        System.out.println(num11111);
        System.out.println(num111111);
        System.out.println("Результат выполнения №4 (вывод объекта a):\n" + a);
        System.out.println("Результат выполнения №5:\n" + d);
    }

}
