package Practice8_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целое число. ");
        int N = input.nextInt();
        System.out.printf("Сумма цифр %d равна %d.", N, sumOfDigits(N));
    }

    public static int sumOfDigits(int N) {
        if (N == 0) return 0;
        return sumOfDigits(N / 10) + (N % 10);
    }
}
