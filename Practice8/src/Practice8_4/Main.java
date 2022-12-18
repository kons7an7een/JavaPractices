package Practice8_4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите 2 натуральных числа: ");
        int k = input.nextInt(), s = input.nextInt();
        if (howMany(k, s) != 0) System.out.printf("Количество %d-значных натуральных чисел," +
                " сумма цифр которых равна %d: %d.", k, s, howMany(k, s));
        else System.out.println("SYSTEM FAILURE");
    }
    public static int howMany(int k, int s) {
        int Q = 0;
        int N = power(10, k-1);
        int lim = N * 10;
        for (; N < lim; N++) {
            if (sumOfDigits(N) == s) Q++;
        }
        return Q;
    }
    public static int sumOfDigits(int N) {
        if (N < 1) return 0;
        return sumOfDigits(N / 10) + (N % 10);
    }

    public static int power(int N, int k) {
        int l = 1;
        for (int i = 0; i < k; i++) {
            l *= N;
        }
        return l;
    }
}
