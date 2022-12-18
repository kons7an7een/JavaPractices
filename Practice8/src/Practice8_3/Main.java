package Practice8_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите целые числа A и B: ");
        int A = input.nextInt(), B = input.nextInt();
        System.out.print("Последовательность чисел:");
        if (A < B) System.out.println(inIncreasingOrder(A, B)); else System.out.println(inDecreasingOrder(A, B));
    }
    public static String inIncreasingOrder(int A, int B) {
        if (A == B) return " " + B;
        return " " + A + inIncreasingOrder(++A, B);
    }
    public static String inDecreasingOrder(int A, int B) {
        if (A == B) return " " + B;
        return " " + A + inDecreasingOrder(--A, B);
    }
}
