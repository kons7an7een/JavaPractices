package just_package;

import java.util.Scanner;
public class seventh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите число: ");
        int n = input.nextInt();
        System.out.print("Факториал " + n + " равен " + factorial(n));
    }

    public static long factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
